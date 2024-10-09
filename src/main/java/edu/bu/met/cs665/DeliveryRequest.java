/**
 * Name: Wei Wang
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/08/2024
 * File Name: DeliveryRequest.java
 * Description: This class is responsible for the methods and attributes of a DeliveryRequest.
 */

package edu.bu.met.cs665;

import edu.bu.met.cs665.untils.observer.Observer;
import edu.bu.met.cs665.untils.observer.Subject;
import java.util.ArrayList;
import java.util.List;


/**
 * This is the DeliveryRequest class.
 * This class is responsible for representing a DeliveryRequest system.
 */
public class DeliveryRequest implements Subject {

  private String request;
  private List<Observer> observers = new ArrayList<>();

  /**
   * Getter method of request message.
   * 
   * @return request message
   */
  public String getRequest() {
    return request;
  }

  /**
   * Notify all the available drivers with the latest deliver request.
   * 
   * @param request the latest request message
   */
  public void sendRequest(String request) {
    this.request = request;
    notifyObservers();
  }

  /**
   * Allow drivers to register to the delivery request notification.
   * 
   * @param o The driver that's interested in the delivery request
   * @return Return true if a driver successfully registers the system
   */
  @Override
  public boolean register(Observer o) {
    return this.observers.add(o);
  }

  /**
   * Allow drivers to unregister to the delivery request notification.
   * 
   * @param o The driver that's not interested in the delivery request anymore
   * @return Reutrn true if a driver successfully unregisters the system
   */
  @Override
  public boolean unregister(Observer o) {
    return this.observers.remove(o);
  }

  /**
   * Notify all the drivers with the latest delivery requests.
   */
  @Override
  public void notifyObservers() {
    for (Observer o : observers) {
      o.update();
    }
  }

}
