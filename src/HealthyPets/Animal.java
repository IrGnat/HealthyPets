package HealthyPets;

/**
 * Created by Iryna Gnatenko
 * Date 9/28/2020
 * Time 5:29 PM
 * Project HealthyPets
 */
abstract class Animal implements IFoodType {
    protected String name;
    protected int weight;

    Animal() {}

    Animal(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }


    public String printMe() {              // polymorfism
        return getName() + " needs food.";

    }

}
