package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

import edu.bu.met.cs665.driver.Van;
import edu.bu.met.cs665.driver.Driver;
import edu.bu.met.cs665.driver.Taxi;

/**
 * Write some Unit tests for your program like the examples below.
 */

public class TestDelivery {

    DeliveryRequest dr = new DeliveryRequest();
    Shop shop = new Shop();

    public TestDelivery() {
    }

    @Test
    public void testVanName() {
        Driver driver = new Van("Van", dr);

        assertEquals(driver.getName(), "Van");

    }

    @Test
    public void testShopItem() {
        shop.prepareItem("ice cream");

        assertEquals(shop.getItem(), "ice cream");

    }

    @Test
    public void testDeliveryRequestMessage() {
        shop.prepareItem("Donut");

        shop.sendDeliverRequest(dr);

        dr.getRequest();

        assertEquals(dr.getRequest(), "Donut");

    }

    @Test
    public void testDeliveryRequestToTaxi() {

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;

        Driver driver = new Taxi("Uber", dr);

        try {
            // Redirect System.out to the output stream
            System.setOut(new PrintStream(outputStream));

            // Call the method that prints the message
            shop.prepareItem("Pizza");
            shop.sendDeliverRequest(dr);

            // Assert that the output is what we expect
            assertEquals("Uber has received a Delivery request: Pizza\n", outputStream.toString());
        } finally {
            // Restore the original System.out
            System.setOut(originalOut);
        }
    }

    @Test
    public void testDeliveryRequestToVan() {

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;

        Driver driver = new Taxi("Big Big Van", dr);

        try {
            // Redirect System.out to the output stream
            System.setOut(new PrintStream(outputStream));

            // Call the method that prints the message
            shop.prepareItem("A lot of food");
            shop.sendDeliverRequest(dr);

            // Assert that the output is what we expect
            assertEquals("Big Big Van has received a Delivery request: A lot of food\n", outputStream.toString());
        } finally {
            // Restore the original System.out
            System.setOut(originalOut);
        }
    }

    @Test
    public void testDeliveryRequestToScooter() {

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;

        Driver driver = new Taxi("Grab", dr);

        try {
            // Redirect System.out to the output stream
            System.setOut(new PrintStream(outputStream));

            // Call the method that prints the message
            shop.prepareItem("Dunkin donut 6 dollar meal!");
            shop.sendDeliverRequest(dr);

            // Assert that the output is what we expect
            assertEquals("Grab has received a Delivery request: Dunkin donut 6 dollar meal!\n", outputStream.toString());
        } finally {
            // Restore the original System.out
            System.setOut(originalOut);
        }
    }

}
