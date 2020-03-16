import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(40, 30);
    }

    @Test
    public void showHowManySheetsLeft() {
        assertEquals(40, printer.getSheetsLeft());
    }

    @Test
    public void showHowMuchTonerLeft() {
        assertEquals(30, printer.getTonerVolume());
    }

    @Test
    public void addSomePaper() {
        printer.addSheets(4);
        assertEquals(44, printer.getSheetsLeft());
    }

    @Test
    public void addSomeToner() {
        printer.addToner(9);
        assertEquals(39, printer.getTonerVolume());
    }

    @Test
    public void printEnoughPaperAndEnoughToner() {
        printer.print(2, 4);
        assertEquals(22, printer.getTonerVolume());
        assertEquals(32, printer.getSheetsLeft());
    }

    @Test
    public void printEnoughPaperButNotEnoughToner() {
        printer.print(9, 4);
        assertEquals(30, printer.getTonerVolume());
        assertEquals(40, printer.getSheetsLeft());
    }

    @Test
    public void printEnoughTonerButNotEnoughPaper() {
        assertEquals(30, printer.getTonerVolume());
        assertEquals(40, printer.getSheetsLeft());
        printer.addToner(30);
        printer.print(10, 6);
        assertEquals(60, printer.getTonerVolume());
        assertEquals(40, printer.getSheetsLeft());
    }

    @Test
    public void printNotEnoughPaperAndNotEnoughToner() {
        assertEquals(30, printer.getTonerVolume());
        assertEquals(40, printer.getSheetsLeft());
        printer.print(10, 4);
        assertEquals(30, printer.getTonerVolume());
        assertEquals(40, printer.getSheetsLeft());

    }

}

