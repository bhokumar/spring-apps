package org.robots.apps.mybatisapp.controller;

import org.robots.apps.mybatisapp.mapper.CityMapper;
import org.robots.apps.mybatisapp.model.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
@RequestMapping("/city")
public class CityController {
    private static final Logger LOGGER  = Logger.getLogger(CityController.class.getName());
    @Autowired
    private CityMapper cityMapper;

    @GetMapping("/{id}")
    public City getCity(@PathVariable("id")int id){
        return  cityMapper.findById(id);
    }

    @PostMapping
    public void createCity(City city){
        LOGGER.log(Level.INFO,"User Details : "+"name : "+city.getName()+" id "+city.getId());
       cityMapper.createCity(city);
    }

}
