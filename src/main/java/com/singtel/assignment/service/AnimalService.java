package com.singtel.assignment.service;

import com.singtel.assignment.animal.Animal;
import com.singtel.assignment.animal.AnimalFactory;
import com.singtel.assignment.utils.AnimalTypeEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AnimalService implements IAnimalService {

    static List<Animal> animals;

    @Autowired
    AnimalFactory animalFactory;

    public List<Animal> getAnimals(){
        animals = new ArrayList<Animal>();
        animals.add((Animal) animalFactory.createAnimal(AnimalTypeEnum.BIRD));
        animals.add((Animal) animalFactory.createAnimal(AnimalTypeEnum.DUCK));
        animals.add((Animal) animalFactory.createAnimal(AnimalTypeEnum.CHICKEN));
        animals.add((Animal) animalFactory.createAnimal(AnimalTypeEnum.FISH));
        animals.add((Animal) animalFactory.createAnimal(AnimalTypeEnum.SHARK));
        animals.add((Animal) animalFactory.createAnimal(AnimalTypeEnum.CLOWN_FISH));
        animals.add((Animal) animalFactory.createAnimal(AnimalTypeEnum.DOLPHIN));
        animals.add((Animal) animalFactory.createAnimal(AnimalTypeEnum.BUTTERFLY));
        animals.add((Animal) animalFactory.createAnimal(AnimalTypeEnum.ROOSTER));
        return animals;
    }
}
