import java.math.BigDecimal;

class BasicsDemo {
  // Adapted from http://www.ntu.edu.sg/home/ehchua/programming/java/J1a_Introduction.html
  static void print() {
    System.out.println("\n\nInside print ...");
    System.out.println("Hello, world!!"); // Advance cursor to beginning of next line
    System.out.println();                 // Print empty line
    System.out.print("Hello, world!!");   // Cursor stayed after the printed string
    System.out.println("Hello,");
    System.out.print(" ");                // Print a space
    System.out.print("world!!");
  }

  static void primitives() {
    //Hexadecimal representation
    byte intHex = 0x0041;
    System.out.println("intHex = " + intHex); // intHex = 65

    //Binary representation (since Java 7)
    int intBinary = 0b01000001; // we can also use an other format like int inBinary = 0b01_000_001 we add underscore (since Java 7 too)
    System.out.println("intBinary = " + intBinary); // intBinary = 65

    //Octal representation
    int intOctal = 0101; // start with 0 
    System.out.println("intOctal = " + intOctal);

    //Differnt representation of Type char
    int intChar = 'A'; //No error compilation
    System.out.println("intChar = " + intChar); //print '65' instead of 'A'

    //Decimal representation
    char charInt = 65;
    System.out.println("charInt = " + charInt); // print 'A';

    //Hexadecimal representation
    char charHex = 0x0041;
    System.out.println("charHex = " + charHex); // print 'A';

    //Binary representation
    char charBinary = 0b010_00001;
    System.out.println("charBinary = " + charBinary); // print 'A';

    //Octal representation
    char charOctal = 0101;
    System.out.println("charOctal = " + charOctal); // print 'A';

  }
  
  public static void main(String[] args) {	
	   	// Language Basics 1
    //printing
		print();		
    
    //Operators
    int i = 2;
    int j = 5;

    System.out.println(i + j);
    System.out.println(i - j);
    System.out.println(i * j);
    System.out.println(i / j);
    System.out.println(i % j);

    //Primitives types format
    primitives();

    System.out.println(1 - 0.9);
		System.out.println(0.1 + 0.2);
		// 0.1 ~ 0.00011001100110011001100110011001100110011001100110011001100110011
		  
		double price = 1000;
		double discountPercent = 0.9;
		double discountAmount = price * discountPercent;
		System.out.println(price - discountAmount);
		System.out.println(price * (1 - discountPercent));
		  
		BigDecimal first = new BigDecimal("0.1");
		BigDecimal second = new BigDecimal("0.2");
		System.out.println(first.add(second));

  }       
}