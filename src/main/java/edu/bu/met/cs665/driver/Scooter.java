/**
 * Name: Wei Wang
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/08/2024
 * File Name: Observer.java
 * Description: This class is responsible for the methods and attributes of a Observer.
 */

package edu.bu.met.cs665.driver;

import edu.bu.met.cs665.DeliveryRequest;

/**
 * This is the Scooter class.
 * This class is responsible for representing a Scooter.
 */
public class Scooter extends Driver {

  /**
   * Create a Scooter object using the name of the driver and delivery request.
   * 
   * @param name The name of the driver
   * @param dr The deliver request that the driver is interested in
   */
  public Scooter(String name, DeliveryRequest dr) {
    super(name, dr);
  }

  /**
   * Get updated when new delivery request is coming.
   */
  @Override
  public void update() {
    System.out.println(this.name + " has received a Delivery request: " + this.dr.getRequest());
  }

}
