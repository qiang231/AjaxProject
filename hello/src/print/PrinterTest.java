package print;

import implement.A4PaperImp;
import implement.ColorInkImp;

public class PrinterTest {
    public static void main(String[] args) {
        Printer printer = new Printer();

        printer.setInkBox(new ColorInkImp());
        printer.setPaper(new A4PaperImp());
        printer.print("测试内容");

    }
}
