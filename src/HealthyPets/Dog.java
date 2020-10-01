package HealthyPets;

/**
 * Created by Iryna Gnatenko
 * Date 9/28/2020
 * Time 5:30 PM
 * Project HealthyPets
 */
public class Dog extends Animal implements FoodPortion {

    Dog() {}

    Dog(String name, int weight) {
        super(name, weight);

    }

    public int foodPortion(int weight, int dividedBy) {
        return weight * 1000 / dividedBy;
    }

    @Override
    public String printMe() {
        return getName() + " needs " + getFoodPortion() + " gr " + FoodType.DOGFOOD.toString();
    }

    @Override
    public int getFoodPortion() {
        return (getWeight() * 1000) / FoodType.DOGFOOD.getDividedBy();
    }

    @Override
    public String getFoodType() {
        return FoodType.DOGFOOD.toString();
    }
}
