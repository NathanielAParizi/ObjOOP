package com.example.objoopsimplealgodemo.Animals;

public class Snake extends Animals {

    private int population = 0;
    private int energy;

    public Snake(int energy) {
        this.population++;
        this.energy = energy;

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


    public void makeSound() {

        System.out.println("Snake: Hisss");
        energy = energy - 3;

    }

    public void eatFood(Food food) {
        System.out.println("Snake is eating" + food.getName());
        energy = energy + 5;
    }

    public void sleep() {
        System.out.println("Snake is sleeping");
        energy = energy + 10;
    }


    public void soundOff() {
        System.out.println("SNAKE: Hisssssss! : " + this.energy);
    }


}
