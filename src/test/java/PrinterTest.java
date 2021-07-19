import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(50, 60);
    }

    @Test
    public void canPrintLessThan50(){
        printer.Print(10,4);
        assertEquals(10, printer.GetPagesLeft());
    }

    @Test
    public void cannotPrintMoreThan50(){
        printer.Print(10,6);
        assertEquals(50,printer.GetPagesLeft());
    }

    @Test
    public void tonerVolumeDrops(){
        printer.Print(10,4);
        assertEquals(20, printer.getTonerVolume());
    }

}
