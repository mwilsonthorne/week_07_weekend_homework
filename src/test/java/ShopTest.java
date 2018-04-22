import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop1;
    StringInstrument stringInstrument1;
    CD compactDisk1;


    @Before
    public void before(){
        shop1 = new Shop();
        stringInstrument1 = new StringInstrument("Fendor Strat", 100, 300, Material.COMPOSITE, Colour.BLACK, StringInstrumentType.GUITAR);
        compactDisk1 = new CD("The Queen Is Dead", 7, 15);
    }

    @Test
    public void windowDisplayEmpty(){
        assertEquals(0, shop1.countWindowItems());
    }

    @Test
    public void noStock(){
        assertEquals(0, shop1.countStock());
    }

    @Test
    public void canAddWindowItem(){
        shop1.addWindowItems(compactDisk1);
        assertEquals(1, shop1.countWindowItems());
    }

    @Test
    public void canRemoveWindowItem(){
        shop1.addWindowItems(compactDisk1);
        assertEquals(1, shop1.countWindowItems());
        shop1.removeWindowItems(compactDisk1);
        assertEquals(0, shop1.countWindowItems());
    }

    @Test
    public void canAddStock(){
        shop1.addStock(stringInstrument1);
        assertEquals(1, shop1.countStock());
    }

    @Test
    public void canRemoveStock(){
        shop1.addStock(stringInstrument1);
        assertEquals(1, shop1.countStock());
        shop1.removeStock(stringInstrument1);
        assertEquals(0, shop1.countStock());
    }

    @Test
    public void canTotalStock(){
        shop1.addStock(stringInstrument1);
        assertEquals(0,shop1.calculateMarkUp(), 0.1);
    }

    @Test
    public void canGetWindowDisplay(){
        shop1.addWindowItems(compactDisk1);
        assertEquals(1, shop1.getWindow().size());
//        assertEquals("The Queen Is Dead", shop1.getWindow().getName());
        assertEquals("CDS ON SALE", shop1.getWindow().get(0).displayItemInWindow("CDS ON SALE"));

    }

    @Test
    public void canGetStock(){
        shop1.addStock(stringInstrument1);
        assertEquals(1, shop1.getStock().size());
        assertEquals("Fendor Strat", shop1.getStock().get(0).getClass().getName());
        assertEquals(200, shop1.getStock().get(0).calculateMarkUp(), 0.1);
    }




}
