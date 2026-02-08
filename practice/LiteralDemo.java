public class LiteralDemo {
    public static void main(String[] args) {
        // 1. Integer Literals
        int decimal = 100;           // Standard base 10
        int binary = 0b1100100;      // Binary (100 in decimal)
        int hex = 0x64;              // Hexadecimal (100 in decimal)
        int underscored = 1_000_000; // Easier to read, same as 1000000
        
        // 2. Long Literal (Note the 'L')
        long debt = 5000000000L; 

        // 3. Floating-Point Literals
        float piFloat = 3.14f;       // 'f' is required
        double piDouble = 3.14159;   // 'd' is optional for doubles
        double scientific = 1.2e3;   // 1.2 * 10^3 = 1200.0

        // 4. Character Literals
        char letter = 'A';
        char unicode = '\u0041';     // Unicode for 'A'
        
        // 5. String Literals
        String greeting = "Hello, WGU Student!";
        String tabbed = "Item:\tPrice"; // \t is a tab literal
        
        // 6. Boolean & Null Literals
        boolean isCoding = true;
        String empty = null;

        // --- OUTPUTS ---
        System.out.println("--- Integer Literals ---");
        System.out.println("Decimal: " + decimal);
        System.out.println("Binary (0b1100100): " + binary);
        System.out.println("Underscored: " + underscored);
        
        System.out.println("\n--- Floating Point ---");
        System.out.println("Float: " + piFloat);
        System.out.println("Scientific Notation (1.2e3): " + scientific);
        
        System.out.println("\n--- Characters & Strings ---");
        System.out.println("Unicode char: " + unicode);
        System.out.println("Escaped String: " + tabbed);
        
        System.out.println("\n--- Boolean & Null ---");
        System.out.println("Boolean: " + isCoding);
        System.out.println("Null reference: " + empty);
    }
}