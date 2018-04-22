import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringInstrumentTest {

    StringInstrument stringInstrument1;

    @Before
    public void before(){
        stringInstrument1 = new StringInstrument("Fender Standard", 100, 150, Material.COMPOSITE, Colour.BROWN, StringInstrumentType.GUITAR);
    }

    @Test
    public void hasName(){
        assertEquals("Fender Standard", stringInstrument1.getName());
    }

    @Test
    public void hasPriceBought(){
        assertEquals(100, stringInstrument1.getPriceBought(), 0.1);
    }

    @Test
    public void hasPriceSold(){
        assertEquals(150, stringInstrument1.getPriceSold(), 0.1);
    }

    @Test
    public void hasMaterial(){
        assertEquals(Material.COMPOSITE, stringInstrument1.getMaterial());
    }

    @Test
    public void hasColour(){
        assertEquals(Colour.BROWN, stringInstrument1.getColour());
    }

    @Test
    public void hasStringInstrumentType(){
        assertEquals(StringInstrumentType.GUITAR, stringInstrument1.getStringInstrumentType());
    }

    @Test
    public void canPlayStringInstrument(){
        assertEquals("Twang, Strum!", stringInstrument1.playObject("Twang, Strum!"));
    }

    @Test
    public void canComparePriceBoughtWithPriceSold(){
        assertEquals(50, stringInstrument1.finalPrice(), 0.1);
    }

    @Test
    public void canSellStringInstrument(){
        assertEquals(50, stringInstrument1.calculateMarkUp(), 0.1);
    }

}
