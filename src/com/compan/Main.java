package com.compan;

public class Main {

    public static void main(String[] args) {

        Animal[] animals = {new Shark(),
                new Turtle(),
                new Eagle()};
        Shark[] sharks = new Shark[12];
        Turtle[] turtles = new Turtle[8];
        Eagle[] eagles = new Eagle[5];

        for (Animal animal : animals) {
            if (animal instanceof Shark) {
                ((Shark) animal).attack();
                 sharks[0] = (Shark) animal;
            } else if (animal instanceof Eagle) {
                ((Eagle) animal).fly();
                  eagles[1] = (Eagle) animal;
            } else if (animal instanceof Turtle) {
                ((Turtle) animal).swim();
                  turtles[2] = (Turtle) animal;
            }
        }
            for (Animal animal1 : animals) {
                if (animal1.getClass().getName() == "com.compan.Shark") {
                    ((Shark) animal1).attack();
                } else if (animal1.getClass().getName()=="com.compan.Turtle"){
                    ((Turtle) animal1).swim();
                } else if (animal1.getClass().getName()=="com.compan.Eagle"){
                    ((Eagle) animal1).fly();
                }

            }

        }

    }


