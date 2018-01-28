package test;

import com.golden.bikerental.model.Bike;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BikeTest {

    Bike bike = new Bike();

    @Test
    void getBikeType() {
        bike.setBikeType("Bell");
        assertTrue(bike.getBikeType().equals("Bell"));
    }

    // Should assert to True since the variable passed to create a new Bike are valid.
    @Test
     void testBikeValidate() {
        Bike b1 = new Bike("High-End Adventure Performance");
        assertTrue(b1.validate(), "b1 validates");
        System.out.println("testBikeValidate Passed");
    }

    // Should assert to false (not validate) since the parameter is invalid
    @Test
     void testNotValidate() {
        Bike b1 = new Bike ();
        assertFalse(b1.validate(), "b1 does not validate");
        System.out.println("testNotValidate Passed");
    }

    @Test
    void testEqualsMethod() {
        Bike bike = new Bike();
        assertFalse(bike == null);
    }

    @Test
    void testEqualsMethod2() {
        Bike bike = new Bike();
        assertFalse(bike.equals(null));
    }

    @Test
    void testSetBike() {
        Bike bike = new Bike();
        bike.setBikeType(Bike.childsBike);
        assertFalse(bike.getBikeType().equals(null));
    }

}