package org.webflux.webfluxapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.webflux.webfluxapp.bean.Employee;
import reactor.core.publisher.Flux;

@RestController
public class EmployeeController {

    @GetMapping("/employees")
    public Employee getEmployee(){
        return new Employee("1000", "Bhoopendra");
    }

    public Flux<Employee> fluxOfemployees(){
        return null;
    }
}
