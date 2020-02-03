package com.example.objoopsimplealgodemo.Animals;

public class Tiger extends Animals {

    protected int population = 0;


    private int energy;


    public Tiger(int energy) {
        this.population++;
        this.energy = energy;
    }

    public void makeSound() {

        System.out.println("Monkey: OOoo OOoo");
        energy = energy - 3;

    }

    public void eatFood(Food food) {

        if (food.getName().equals("grain")) {
            System.out.println("Tiger can't eat grain because they have sensitive digestive systems.");
        } else {
            System.out.println("Tiger is eating " + food.getName());
        }
        energy = energy + 5;
    }

    public void sleep() {
        System.out.println("Monkey is sleeping");
        energy = energy + 5;
    }


    public void soundOff() {
        System.out.println("Tiger: ROAAAR  energy: " + this.energy);
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
