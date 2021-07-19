import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterBottle;

    @Before
    public void before(){ waterBottle = new WaterBottle(100);}

    @Test
    public void canDrink(){
        waterBottle.Drink();
        assertEquals(90, waterBottle.getVolume());
    }

    @Test
    public void canDrink5Times(){
        for (int i = 1; i <=5; i++){
            waterBottle.Drink();
        }
        assertEquals(50, waterBottle.getVolume());
    }

    @Test
    public void canEmptyBottle(){
        waterBottle.EmptyBottle();
        assertEquals(0, waterBottle.getVolume());
    }

    @Test
    public void canFillBottle(){
        waterBottle.EmptyBottle();
        waterBottle.FillBottle();
        assertEquals(100, waterBottle.getVolume());
    }
}
