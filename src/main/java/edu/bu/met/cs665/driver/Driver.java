/**
 * Name: Wei Wang
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/08/2024
 * File Name: Driver.java
 * Description: This class is responsible for the methods and attributes of a Driver.
 */

package edu.bu.met.cs665.driver;

import edu.bu.met.cs665.DeliveryRequest;
import edu.bu.met.cs665.untils.observer.Observer;

/**
 * This is the Driver class.
 * This class is responsible for representing a Driver.
 */
public abstract class Driver implements Observer {
  protected String name;

  protected DeliveryRequest dr;

  /**
   * Create a Driver object using name and DeliveryRequest.
   *
   * @param name The name of the driver
   * @param dr The deliver request that the driver is interested in
   */
  public Driver(String name, DeliveryRequest dr) {
    this.name = name;
    this.dr = dr;
    this.dr.register(this);
  }

  /**
   * Getter method of the driver name.
   * 
   * @return The name of the driver
   */
  public String getName() {
    return name;
  }

}
