public class MyFirstProgram {
    public static void main(String[] args) {
        // 1. Create instances (objects) of your other classes
        Programmer mySelf = new Programmer("reggie");
        Printer myPrinter = new Printer();

        // 2. Use the objects to perform actions
        myPrinter.printSeparator();
        mySelf.announce();
        myPrinter.printSeparator();
    }
}
