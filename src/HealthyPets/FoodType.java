package HealthyPets;

/**
 * Created by Iryna Gnatenko
 * Date 9/29/2020
 * Time 8:29 PM
 * Project HealthyPets
 */

//Use an enum constructor, instance variable and method.
public enum FoodType {
    DOGFOOD (100), CATFOOD (150), SNAKEFOOD (20);
    private int dividedBy; // incapsulation

    // constructor
    FoodType (int divided) {
        dividedBy = divided;
    }

    // method
    public int getDividedBy() {
        return dividedBy;
    }



}
