/**
 * Name: Wei Wang
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/08/2024
 * File Name: Shop.java
 * Description: This class is responsible for the methods and attributes of a Shop.
 */

package edu.bu.met.cs665;


/**
 * This is the Shop class.
 * This class is responsible for representing a Shop.
 */
public class Shop {

  private String item;

  /**
   * The getter method of getting the item.
   * 
   * @return The item name
   */
  public String getItem() {
    return item;
  }

  /**
   * Prepare the item.
   * 
   * @param item prepare the item for later sale
   */
  public void prepareItem(String item) {
    this.item = item;
  }

  /**
   * This method should be called after the system has already prepared the item.
   * Afterwards, the shop can send the order request to the delivery system.
   * 
   * @param dr The system in charge of broadcasting the order request to drivers
   */
  public void sendDeliverRequest(DeliveryRequest dr) {
    dr.sendRequest(item);
  }

}
