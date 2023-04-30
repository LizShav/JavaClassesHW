package class13;

public class E9MethodPrinterTester {
    public static void main(String[] args) {
        E9MethodPrinter printer=new E9MethodPrinter();
        printer.printSomething();//will print 4 lines from E9methods
        printer.printSomething();//will print another set of 8 lines

        printer.printWord("Darko");
        printer.printWord("Artem Lean");

        printer.printWordManyTimes("Sunday",10);



    }
}
