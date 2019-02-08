package org.webflux.webfluxapp;

import org.junit.Before;
import org.junit.Test;
import org.mockito.BDDMockito;
import org.mockito.Mockito;
import org.reactivestreams.Publisher;
import org.springframework.test.web.reactive.server.WebTestClient;
import org.webflux.webfluxapp.controllers.VendorController;
import org.webflux.webfluxapp.domain.Vendor;
import org.webflux.webfluxapp.repositories.VendorRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class VendorControllerTest {
    private WebTestClient webTestClient;
    private VendorRepository vendorRepository;
    private VendorController vendorController;


    @Before
    public void setUp() {
        vendorRepository = Mockito.mock(VendorRepository.class);
        vendorController = new VendorController(vendorRepository);
        webTestClient = WebTestClient.bindToController(vendorController).build();
    }

    @Test
    public void list() {
        BDDMockito.given(vendorRepository.findAll()).willReturn(Flux.just(new Vendor("2001", "Vendor", "Just"), new Vendor("2201", "Bhoopendra", "Kumar")));
        webTestClient.get().uri("/api/v1/vendors").exchange().expectBodyList(Vendor.class).hasSize(2);
    }


    @Test
    public void findById() {
        BDDMockito.given(vendorRepository.findById("someId")).willReturn(Mono.just(new Vendor("someId", "firstName", "lastName")));
        webTestClient.get().uri("/api/v1/vendors/someId").exchange().expectBody(Vendor.class);
    }

    @Test
    public void createVendorTest() {
        BDDMockito.given(vendorRepository.saveAll(Mockito.any(Publisher.class))).willReturn(Flux.just(new Vendor("someId", "firstName", "lastName")));
        Mono<Vendor> vendor = Mono.just(new Vendor("someId", "firstName", "lastName"));
        webTestClient.post().uri("/api/v1/vendors").body(vendor, Vendor.class).exchange().expectStatus().isCreated();
    }

    @Test
    public void updateVendorTest() {
        BDDMockito.given(vendorRepository.save(Mockito.any(Vendor.class))).willReturn(Mono.just(new Vendor("someId", "firstName", "lastName")));
        Mono<Vendor> vendor = Mono.just(new Vendor("someId", "firstName", "lastName"));
        webTestClient.put().uri("/api/v1/vendors/newId").body(vendor, Vendor.class).exchange().expectStatus().isOk();
    }

    @Test
    public void patchWithChanges() {
        BDDMockito.given(vendorRepository.findById(Mockito.anyString())).willReturn(Mono.just(new Vendor("007","firstName", "lastName")));
        BDDMockito.given(vendorRepository.save(Mockito.any(Vendor.class))).willReturn(Mono.just(new Vendor("007", "firstName","lastName")));
        webTestClient.patch().uri("/api/v1/vendors/007").body(Mono.just(new Vendor("007", "NewFirstName", "lastName")), Vendor.class).exchange().expectStatus().isOk();
        Mockito.verify(vendorRepository).save(Mockito.any(Vendor.class));
    }

    @Test
    public void patchWithNoChanges() {
        BDDMockito.given(vendorRepository.findById(Mockito.anyString())).willReturn(Mono.just(new Vendor("007","firstName", "lastName")));
        BDDMockito.given(vendorRepository.save(Mockito.any(Vendor.class))).willReturn(Mono.just(new Vendor("007", "firstName","lastName")));
        webTestClient.patch().uri("/api/v1/vendors/007").body(Mono.just(new Vendor("007", "firstName", "lastName")), Vendor.class).exchange().expectStatus().isOk();
        Mockito.verify(vendorRepository, Mockito.never()).save(Mockito.any(Vendor.class));
    }
}
