package HealthyPets;

/**
 * Created by Iryna Gnatenko
 * Date 9/28/2020
 * Time 5:30 PM
 * Project HealthyPets
 */
public class Cat extends Animal implements FoodPortion {

    Cat() {}

    Cat(String name, int weight) {
        super(name, weight);
    }


    @Override
    public int getFoodPortion() {
        return (getWeight() * 1000) / FoodType.CATFOOD.getDividedBy();
    }

    @Override
    public String printMe() {
        return getName() + " needs " + getFoodPortion() + " gr " + FoodType.CATFOOD.toString();
    }

    @Override
    public String getFoodType() {
        return FoodType.CATFOOD.toString();
    }
}
