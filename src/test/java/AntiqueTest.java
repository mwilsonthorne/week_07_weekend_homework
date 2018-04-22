import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AntiqueTest {

    Antique antique1;

    @Before
    public void before(){
        antique1 = new Antique("Faux Tortoise Guitar", 300, 200, Material.WOOD, Colour.TRANSPARENT, AntiqueInstrumentType.STRING);
    }

    @Test
    public void hasAntiqueInstrumentType(){
        assertEquals(AntiqueInstrumentType.STRING, antique1.getAntiqueInstrumentType());
    }

    @Test
    public void antiqueDisplayedInWindow(){
        assertEquals("Tortoise Guitar circa 1890. NOT FOR SALE", antique1.displayItemInWindow("Tortoise Guitar circa 1890. NOT FOR SALE"));
    }

}
