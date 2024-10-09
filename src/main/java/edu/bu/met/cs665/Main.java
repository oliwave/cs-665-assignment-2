/**
 * Name: Wei Wang
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/08/2024
 * File Name: Main.java
 * Description: The entry point of the program
 */

package edu.bu.met.cs665;

import edu.bu.met.cs665.driver.Driver;
import edu.bu.met.cs665.driver.Scooter;
import edu.bu.met.cs665.driver.Taxi;
import edu.bu.met.cs665.driver.Van;
import java.util.ArrayList;
import java.util.List;

/**
 * This is the Main class.
 */
public class Main {

  /**
   * A main method to run examples.
   * You may use this method for development purposes as you start building your
   * assignments/final project. This could prove convenient to test as you are
   * developing.
   * However, please note that every assignment/final projects requires JUnit
   * tests.
   */
  public static void main(String[] args) {
    DeliveryRequest dr = new DeliveryRequest();
    List<Driver> drivers = new ArrayList<>();

    drivers.add(new Van("Mini Van", dr));
    drivers.add(new Van("big van", dr));
    drivers.add(new Taxi("Uber", dr));
    drivers.add(new Taxi("Lyft", dr));
    drivers.add(new Scooter("Grab", dr));

    Shop shop = new Shop();
    shop.prepareItem("Watermelon sugar high!");
    shop.sendDeliverRequest(dr);

    shop.prepareItem("A box of apple");
    drivers.add(new Scooter("Food Panda", dr));

    shop.sendDeliverRequest(dr);
  }
}
