/**
 * Name: Wei Wang
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/08/2024
 * File Name: Observer.java
 * Description: This class is responsible for the methods and attributes of a Observer.
 */

package edu.bu.met.cs665.untils.observer;

/**
 * This is the Observer class.
 * This class is responsible for representing a Observer.
 */
public interface Observer {

  /*
   * Get called when Subject execute the notifyObservers method.
   */
  void update();

}
