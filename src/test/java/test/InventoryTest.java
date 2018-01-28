package test;

import com.golden.bikerental.model.Bike;
import com.golden.bikerental.model.Inventory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InventoryTest {

    @Test
    public void testCurrentStock() {
        Inventory testStock = new Inventory();
        assertTrue (   testStock.currentStock(Bike.childsBike) == 3);
        System.out.println("testCurrentStock Passed.");
    }

    @Test
    public void testBikesCheckedOutFalse() {
        Inventory testBikeCheckOut = new Inventory();
        assertFalse (testBikeCheckOut.currentStock(Bike.childsBike) == 1);
        System.out.println("testBikesCheckedOutFalse Passed");
    }

}