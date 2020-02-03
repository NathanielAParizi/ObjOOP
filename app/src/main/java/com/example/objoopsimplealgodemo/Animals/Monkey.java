package com.example.objoopsimplealgodemo.Animals;

public class Monkey extends Animals {

    private int population = 0;
    private int energy;

    public Monkey(int energy) {
        this.population++;
        this.energy = energy;

    }


    public void makeSound() {

        System.out.println("Monkey: OOoo OOoo");
        energy = energy - 4;

    }

    public void eatFood(Food food) {
        System.out.println("Monkey is eating" + food.getName());
        energy = energy + 2;
    }

    public void sleep() {
        System.out.println("Monkey is sleeping");
        energy = energy + 10;
    }

    public void play() {

        if (energy >= 8) {
            System.out.println("(Monkey is playing!) Oooo Oooo!");
            energy = energy - 8;
        } else {
            System.out.println("(Monkey is too tired to play");

        }
    }

    public void soundOff() {
        System.out.println("MONKEY: OOOO AAHH!! : " + this.energy);
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }


}
