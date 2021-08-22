package com.singtel.assignment;

import com.singtel.assignment.animal.bird.Bird;
import com.singtel.assignment.animal.bird.Chicken;
import com.singtel.assignment.animal.bird.Duck;
import com.singtel.assignment.animal.bird.Parrot;
import com.singtel.assignment.utils.NeighbourTypeEnum;

public class PrintSolution {

    public static void main(String args[]){
        //Section A
        //Question1
        System.out.println("Question1 output:");
        Bird bird = new Bird();
        bird.walk();

        //Question 2
        System.out.println("Question2 output:");
        Duck duck = new Duck();
        Chicken chicken =new Chicken();
        duck.swim();
        duck.sing();
        chicken.sing();

        //Question 3
        System.out.println("Question3 output:");

        Chicken rooster = new Chicken(Boolean.TRUE);
        rooster.sing();
        Parrot parrot=  new Parrot(NeighbourTypeEnum.ROOSTER);
        parrot.sing();

        //Question 4
        System.out.println("Question4 output:");
        Parrot parrot1=  new Parrot(NeighbourTypeEnum.DOG);
        parrot1.sing();

        Parrot parrot2=  new Parrot(NeighbourTypeEnum.CAT);
        parrot2.sing();

        Parrot parrot3=  new Parrot(NeighbourTypeEnum.ROOSTER);
        parrot3.sing();

        Parrot parrot4=  new Parrot(NeighbourTypeEnum.DUCK);
        parrot4.sing();
    }
}
