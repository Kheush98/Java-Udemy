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

  }       
}