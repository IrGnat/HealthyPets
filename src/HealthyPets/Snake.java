package HealthyPets;

/**
 * Created by Iryna Gnatenko
 * Date 9/28/2020
 * Time 5:30 PM
 * Project HealthyPets
 */
public class Snake extends Animal {

    Snake() {}

    public Snake(String name, int weight) {
        super(name, weight);
    }


    @Override
    public String printMe() {
        return getName() + " needs 20 gr " + FoodType.SNAKEFOOD.toString();
    }


    @Override
    public String getFoodType() {
        return FoodType.SNAKEFOOD.toString();
    }
}
