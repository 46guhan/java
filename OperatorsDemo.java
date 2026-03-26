public class OperatorsDemo {

    public static void main(String[] args) {

        /* 
           1. ARITHMETIC OPERATORS
           +  -  *  /  %
        */
        int a = 10, b = 3;
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b)); // Addition
        System.out.println("a - b = " + (a - b)); // Subtraction
        System.out.println("a * b = " + (a * b)); // Multiplication
        System.out.println("a / b = " + (a / b)); // Division
        System.out.println("a % b = " + (a % b)); // Modulus
        System.out.println();


        /* 
           2. RELATIONAL (COMPARISON) OPERATORS
           ==  !=  >  <  >=  <=
        */
        System.out.println("Relational Operators:");
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a > b  : " + (a > b));
        System.out.println("a < b  : " + (a < b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a <= b : " + (a <= b));
        System.out.println();


        /* 
           3. LOGICAL OPERATORS
           &&  ||  !
        */
        boolean x = true, y = false;
        System.out.println("Logical Operators:");
        System.out.println("x && y : " + (x && y)); // AND
        System.out.println("x || y : " + (x || y)); // OR
        System.out.println("!x     : " + (!x));     // NOT
        System.out.println();

        System.out.println(a>5 && b<5);


        /* 
           4. ASSIGNMENT OPERATORS
           =  +=  -=  *=  /=  %=
        */
        int c = 5;
        System.out.println("Assignment Operators:");
        c += 2;  // c = c + 2
        System.out.println("c += 2 -> " + c);

        c -= 1;  // c = c - 1
        System.out.println("c -= 1 -> " + c);

        c *= 3;  // c = c * 3
        System.out.println("c *= 3 -> " + c);

        c /= 2;  // c = c / 2
        System.out.println("c /= 2 -> " + c);

        c %= 2;  // c = c % 2
        System.out.println("c %= 2 -> " + c);
        System.out.println();


        /* 
           5. UNARY OPERATORS
           ++  --  
        */
        int d = 10;
        int e = 10;
        System.out.println("Unary Operators:");
        System.out.println("++d = " + (++d)); // Pre-increment
        System.out.println("e++ = " + (e++)); // Post-increment
        System.out.println("e++ = " + (e++));
        System.out.println("--d = " + (--d)); // Pre-decrement
        System.out.println();


        /* 
           6. BITWISE OPERATORS
           &  |  ^  ~  <<  >>  >>>
        */
        int m = 5, n = 3; 
        // 5=000101 
        // 3=000011
	// r= 
        
        System.out.println("Bitwise Operators:");
        System.out.println("m & n  = " + (m & n));   // AND
        System.out.println("m | n  = " + (m | n));   // OR
        System.out.println("m ^ n  = " + (m ^ n));   // XOR
        System.out.println("~m     = " + (~m));      // NOT
        System.out.println("m << 1 = " + (m << 1));  // Left shift
        System.out.println("m >> 1 = " + (m >> 1));  // Right shift
        System.out.println();


        /* 
           7. TERNARY OPERATOR
           condition ? value1 : value2
        */
        int age = 18;
        String result = (age >= 18) ? "Eligible to vote" : "Not eligible";
        System.out.println("Ternary Operator:");
        System.out.println(result);
        System.out.println();


        /* 
           8. INSTANCEOF OPERATOR
        */
        String str = "Java";
        System.out.println("Instanceof Operator:");
        System.out.println("str instanceof String : " + (str instanceof String));
        System.out.println();


        /* 
           9. TYPE CASTING OPERATORS
        */
        double price = 99.99;
        int newPrice = (int) price; // Explicit casting
        System.out.println("Type Casting:");
        System.out.println("double to int: " + newPrice);
    }
}
