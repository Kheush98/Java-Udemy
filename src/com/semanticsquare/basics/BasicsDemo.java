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
  System.out.println("\n\nInside primitives ..."); 
  // literals demo
  int intHex = 0x0041;
  System.out.println("intHex: " + intHex);
  int intBinary = 0b01000001;
  System.out.println("intBinary: " + intBinary);
  int intChar = 'A'; // holds decimal equivalent, which is 65
  System.out.println("intChar: " + intChar);
  int intUnderscore = 1_23_456;
  System.out.println("intUnderscore: " + intUnderscore);
  
  char charA = 'A';
  System.out.println("charA: " + charA);
  char charInt = 65;
  System.out.println("charInt: " + charInt);
  char charUnicode1 = '\u0041'; // 4 * (16 power 1 )+ 1 * (16 power 0)
  System.out.println("charUnicode1: " + charUnicode1);
  char charUnicode2 = 0x41;     // 4 * (16 power 1 )+ 1 * (16 power 0)
  System.out.println("charUnicode2: " + charUnicode2);
  char charBinary = 0b01000001; // binary corresponding to decimal 65
  System.out.println("charBinary: " + charBinary);	  		  	  
  }

  static void typeCasting() {
    System.out.println("\nInside typeCasting ...");
    // Explicit casting
    long y = 42;
    //int x = y;
    int x = (int)y;
    
    // Information loss due to out-of-range assignment
    byte narrowdByte = (byte)123456; 
    System.out.println("narrowdByte: " + narrowdByte); 
  
  // Truncation
  int iTruncated = (int)0.99;
  System.out.println("iTruncated: " + iTruncated); 
  
  // Implicit cast (int to long)
  y = x;
  
  // Implicit cast (char to int)
  char cChar = 'A';
  int iInt = cChar; 
  System.out.println("iInt: " + iInt);
  
  // byte to char using an explicit cast
  byte bByte = 65;
  cChar = (char)bByte; // special conversion (widening from byte --> int followed by narrowing from int --> char)
  System.out.println("cChar: " + cChar);
  }

  static void arrays() {
    int[] scores = new int[4];
    scores[0] = 90;
    scores[1] = 70;
    scores[2] = 80;
    scores[3] = 100;

    //other way to declare arrays variables
    /*
      int[] scores = new int[] {90, 70, 80, 100};
      int[] scores = {90, 70, 80, 100};   
    */

    System.out.println("\nInside arrays...");
    System.out.println("Mid-Term 1: " + scores[0]);
    System.out.println("Mid-Term 2: " + scores[1]);
    System.out.println("Final: " + scores[2]);
    System.out.println("Project: " + scores[3]);
    System.out.println("Lenght: " + scores.length);

    // Student[] students = new Student[3];
    // students[0] = new Student();
    // students[1] = new Student();
    // students[2] = new Student();
    //other way to declare arrays variables (object)
    /* 
      Student[] students = new Student[3] {new Student(), new Student(), new Student()}; 
      Student[] students = {new Student(), new Student(), new Student()}; 
    */
    // students[0].name = "Cheikh";
    // students[1].name = "Fatima";
    // students[2].name = "Kheush";
    // System.out.println("Student 1: " + students[0].name);
    // System.out.println("Student 2: " + students[1].name);
    // System.out.println("Student 2: " + students[2].name);
  }

  static void threeDimensionalArrays() {
    System.out.println("\nInside threeDimensionalArrays ...");
    int[][][] unitsSold = new int[][][]{ 
                      { // New York
                        {0,0,0,0}, // Jan
                        {0,0,0,0}, // Feb
                        {0,0,0,0}, // Mar
                        {0,850,0,0}// Apr	
                      },
                      { // San Francisco
                        {0,0,0,0}, // Jan
                        {0,0,0,0}, // Feb
                        {0,0,0,0}, // Mar
                        {0,0,0,0}  // Apr
                      },
                      { 
                        {0,0,0,0},
                        {0,0,0,0},
                        {0,0,0,0},
                        {0,0,0,0}
                      },
                      {
                        {0,0,0,0},
                        {0,0,0,0},
                        {0,0,0,0},
                        {0,0,0,0}
                      }
                    };
                          
   System.out.println("unitsSold[0][3][1]: " + unitsSold[0][3][1]);
 }

  static float sum(double x, double y) {
    return (float) (x + y);
  }

  static double avg(double x, double y) {
    double sum = sum (x, y);
    return sum/2;
  }

  static boolean search(int[] list, int key) {
    return true;
  }
  
  static void go(int[] tab) {
    System.out.println("array[0] :" + tab[0]);
	System.out.println("array[1] :" + tab[1]);
	tab[1] = 22;
  }
  
  static void go(int i) {
    System.out.println("go(int i)");
  }
  
  static void go(short s) {
    System.out.println("go(short s)");
  }
  
  static void varargsOverload(boolean b, int i, int j, int k) {
	  System.out.println("\nInside method Without varargs");
  }
  
  static void varargsOverload(boolean b, int... list) {
	  System.out.println("\nInside method with varargs");
	  System.out.println("Lenght : " + list.length);
  }

  public static void main(String[] args) {	
  // Language Basics 1
  //print();				
  //primitives();
  // typeCasting(); 
  // arrays();
  // threeDimensionalArrays();
  varargsOverload(true, 1, 2, 3);
  varargsOverload(true, 1, 2, 3, 4, 5, 6, 7, 8);
  varargsOverload(true);
  }       
}