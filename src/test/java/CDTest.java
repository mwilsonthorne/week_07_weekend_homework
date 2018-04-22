import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CDTest {

    CD compactDisk1;

    @Before
    public void before(){
        compactDisk1 = new CD("Dark Side of the Moon", 8, 15);
    }

    @Test
    public void canPlayCompactDisks(){
        assertEquals("Playing: Track 1", compactDisk1.playObject("Playing: Track 1"));
    }

    @Test
    public void canDisplayCompactDisks(){
        assertEquals("BOOKS,MAGS,CDS,MUSIC SHEETS ON SALE", compactDisk1.displayItemInWindow("BOOKS,MAGS,CDS,MUSIC SHEETS ON SALE"));
    }

    @Test
    public void canSellCompactDisk(){
        assertEquals(7, compactDisk1.calculateMarkUp(), 0.1);
    }

}
