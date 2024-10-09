/**
 * Name: Wei Wang
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/08/2024
 * File Name: Subject.java
 * Description: This class is responsible for the methods and attributes of a Subject.
 */

package edu.bu.met.cs665.untils.observer;

/**
 * This is the Subject class.
 * This class is responsible for representing a Subject.
 */
public interface Subject {

  /*
   * Allow observer to register.
   */
  boolean register(Observer o);

  /*
   * Allow observer to unregister.
   */
  boolean unregister(Observer o);

  /*
   * Notify observers when state has changed.
   */
  void notifyObservers();

}
