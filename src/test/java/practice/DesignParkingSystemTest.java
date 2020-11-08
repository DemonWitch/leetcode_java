package practice;

import org.junit.Assert;
import org.junit.Test;

/**
 * @Author Richard Lv
 * @Date 2020/11/8 22:29
 * @Version 1.0
 * @Description
 */
public class DesignParkingSystemTest {
    @Test
    public void designParkingSystemTest(){
        DesignParkingSystem parkingSystem = new DesignParkingSystem(1, 1, 0);
        Assert.assertTrue(parkingSystem.addCar(1));; // return true because there is 1 available slot for a big car
        Assert.assertTrue(parkingSystem.addCar(2)); // return true because there is 1 available slot for a medium car
        Assert.assertFalse(parkingSystem.addCar(3)); // return false because there is no available slot for a small car
        Assert.assertFalse(parkingSystem.addCar(1)); // return false because there is no available slot for a big car. It is already occupied.

    }
}
