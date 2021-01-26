package kr.ac.gwnu.com.singleton;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PrinterTest {
    @Test
    public void test_getInstance() {
        Printer printer1 = Printer.getInstance();
        Printer printer2 = Printer.getInstance();

        assertNotNull(printer1);
        assertNotNull(printer2);

        assertTrue(printer1 == printer2);
    }
}
