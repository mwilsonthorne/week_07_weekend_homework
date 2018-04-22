import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccessoryTest {

    Accessory accessory1;

    @Before
    public void before() {
        accessory1 = new Accessory("Plectrum", 0.1, 0.2, Catagory.EQUIPMENT);
    }

    @Test
    public void hasCatagory(){
        assertEquals(Catagory.EQUIPMENT, accessory1.getCatagory());
    }

    @Test
    public void canSellAccessory(){
        assertEquals(0.1, accessory1.calculateMarkUp(), 0.01);
    }

}