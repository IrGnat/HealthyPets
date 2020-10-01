package HealthyPets;

import javax.swing.*;


/**
 * Created by Iryna Gnatenko
 * Date 9/28/2020
 * Time 5:49 PM
 * Project HealthyPets
 */
public class Hotel {

    public static void main(String[] args) {

        Animal sixten = new Dog("Sixten", 5);
        Animal dogge = new Dog("Dogge", 10);

        Animal venus = new Cat("Venus", 5);
        Animal ove = new Cat("Ove", 3);

        Animal hypno = new Snake("Hypno", 1);


            String petsName;

            while (true) {
                petsName = JOptionPane.showInputDialog("What is the name of your pet?");
                switch (petsName) {
                    case "Sixten":
                    JOptionPane.showMessageDialog(null, sixten.printMe());
                    case "Dogge":
                    JOptionPane.showMessageDialog(null, dogge.printMe());
                    break;
                    case "Venus":
                    JOptionPane.showMessageDialog(null, venus.printMe());
                    break;
                    case "Ove":
                    JOptionPane.showMessageDialog(null, ove.printMe());
                    break;
                    case "Hypno":
                    JOptionPane.showMessageDialog(null, hypno.printMe());
                    break;
                    default:
                    JOptionPane.showMessageDialog(null, "This pet is not currently at the hotel.");

                       }
        }
    }
}












