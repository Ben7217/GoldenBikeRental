package test;

import com.golden.bikerental.model.Bike;
import com.golden.bikerental.services.BikeServiceFactory;
import com.golden.bikerental.services.IBikeService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BikeServiceFactoryTest {

    @Test
    public void testFactory() {
        IBikeService bikeService = BikeServiceFactory.usersBikeChoice(Bike.childsBike);
        assertTrue(bikeService.getBike().getBikeType().equals(Bike.childsBike));
    }


}