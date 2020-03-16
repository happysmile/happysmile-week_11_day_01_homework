import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class WaterBottleTest {

    WaterBottle waterbottle = new WaterBottle();

    @Test
    public void drinks10litres() {
        waterbottle.drink();
        assertEquals(90, waterbottle.getVolume());
    }

    @Test
    public void emptiesBottle(){
        waterbottle.empty();
        assertEquals(0, waterbottle.getVolume());
    }

    @Test
    public void fillsBottle(){
        waterbottle.fill();
        assertEquals(100, waterbottle.getVolume() );
    }



}


