package org.webflux.webfluxapp.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.webflux.webfluxapp.domain.Category;
import org.webflux.webfluxapp.domain.Vendor;
import org.webflux.webfluxapp.repositories.CategoryRepository;
import org.webflux.webfluxapp.repositories.VendorRepository;

@Component
public class BootStrap implements CommandLineRunner {
    private final CategoryRepository categoryRepository;
    private final VendorRepository vendorRepository;

    public BootStrap(CategoryRepository categoryRepository, VendorRepository vendorRepository) {
        this.categoryRepository = categoryRepository;
        this.vendorRepository = vendorRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        if(categoryRepository.count().block() == 0) {
            System.out.println("Loading data on bootstrap ");
            categoryRepository.save(new Category("1001","Fruits")).block();
            categoryRepository.save(new Category("1002","Nuts")).block();
            categoryRepository.save(new Category("1003","Breads")).block();
            categoryRepository.save(new Category("1004","Meats")).block();
            categoryRepository.save(new Category("1005","Eggs")).block();

            System.out.println(categoryRepository.count().block());

            vendorRepository.save(new Vendor("2005", "joe", "Black")).block();
            vendorRepository.save(new Vendor("2006", "Bhoopendra", "Kumar")).block();
            System.out.println(vendorRepository.count().block());
        }

    }
}
