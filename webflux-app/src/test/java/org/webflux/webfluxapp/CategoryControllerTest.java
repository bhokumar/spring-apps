package org.webflux.webfluxapp;

import org.junit.Before;
import org.junit.Test;
import org.mockito.BDDMockito;
import org.mockito.Mockito;
import org.mockito.internal.matchers.Any;
import org.reactivestreams.Publisher;
import org.springframework.test.web.reactive.server.WebTestClient;
import org.webflux.webfluxapp.controllers.CategoryController;
import org.webflux.webfluxapp.domain.Category;
import org.webflux.webfluxapp.repositories.CategoryRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class CategoryControllerTest {
    private WebTestClient webTestClient;
    private CategoryRepository categoryRepository;
    private CategoryController categoryController;

    @Before
    public void setUp() {
        categoryRepository = Mockito.mock(CategoryRepository.class);
        categoryController = new CategoryController(categoryRepository);
        webTestClient = WebTestClient.bindToController(categoryController).build();
    }

    @Test
    public void list() {
        BDDMockito.given(categoryRepository.findAll()).willReturn(Flux.just(new Category("7801", "Fruits")));
        webTestClient.get().uri("/api/v1/categories").exchange().expectBodyList(Category.class).hasSize(1);
    }

    @Test
    public void findById() {
        BDDMockito.given(categoryRepository.findById("someId")).willReturn(Mono.just(new Category("someId", "description")));
        webTestClient.get().uri("/api/v1/categories/someId").exchange().expectBody(Category.class);
    }

    @Test
    public void testCreateCategory() {
       BDDMockito.given(categoryRepository.saveAll(Mockito.any(Publisher.class))).willReturn(Flux.just(new Category("002", "Description1")));
        Mono<Category> category = Mono.just(new Category("5601","Animals"));
        webTestClient.post().uri("/api/v1/categories").body(category, Category.class).exchange().expectStatus().isCreated();
    }

    @Test
    public void testUpdateCategory() {
        BDDMockito.given(categoryRepository.save(Mockito.any(Category.class))).willReturn(Mono.just(new Category("002", "Description1")));
        Mono<Category> category = Mono.just(new Category("5601","Animals"));
        webTestClient.put().uri("/api/v1/categories/5601").body(category, Category.class).exchange().expectStatus().isOk();
    }

}
