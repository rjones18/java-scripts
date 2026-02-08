public class MyDataTypes {
    public static void main(String[] args) {
        // --- WHOLE NUMBERS ---
        
        // byte: 8-bit. Range: -128 to 127. Good for saving memory in large arrays.
        byte by = 127; 
        
        // short: 16-bit. Range: -32,768 to 32,767.
        short sh = 558; 
        
        // int: 32-bit. The "default" for whole numbers. Range: approx -2 billion to 2 billion.
        int num = 3; 
        
        // long: 64-bit. Used when 'int' isn't big enough. 
        // Note the 'l' at the end—this tells Java to treat the number as a long literal.
        long l = 5854l; 

        // --- DECIMAL (FLOATING POINT) NUMBERS ---
        
        // float: 32-bit. You must use '(float)' or add an 'f' at the end (5.8f) 
        // because Java treats all decimals as 'double' by default.
        float f = (float) 5.8; 
        
        // double: 64-bit. The standard for decimal points; more precise than float.
        double d = 5.8; 

        // --- OTHER TYPES ---
        
        // char: 16-bit Unicode character. Must use SINGLE quotes (' ').
        char c = 'k'; 
        
        // boolean: Only two possible values: true or false.
        boolean b = true; 

        // --- EXAMPLES OF USE ---
        
        System.out.println("1. Math with int and byte: " + (num + by));
        System.out.println("2. Long value display: " + l);
        System.out.println("3. Is the boolean set? " + b);
        System.out.println("4. The character we stored is: " + c);
        System.out.println("5. Mixing double and int: " + (d + num));
    }
}