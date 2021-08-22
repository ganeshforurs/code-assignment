package com.singtel.assignment.controller;

import com.singtel.assignment.animal.Animal;
import com.singtel.assignment.service.IAnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Author ganesh created by 22-Aug 2021
 * Rest controller give the response of all animals
 * getAnimals is the URI
 */
@RestController
public class AnimalController {

    @Autowired
    IAnimalService animalService;

    @GetMapping("/getAnimals")
    public List<Animal> getAnimals(){
       return animalService.getAnimals();
    }
}
