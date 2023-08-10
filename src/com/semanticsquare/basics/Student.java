class Student {    
    int id = 1000;	
	byte age = 18;
    short rank = 165; //[-128, 127]
    long phone = 22_345_678_90L; //Java -- readability
    
    // Integer literals: int literal, long literal
    int maxValue = Integer.MAX_VALUE; 
    int minValue = Integer.MIN_VALUE;

    byte maxValueB = Byte.MAX_VALUE; 
    byte minValueB = Byte.MIN_VALUE; 

	void compute() {	    
		int nextId = id + 1;
		
	    System.out.println("id: " + id);
		System.out.println("nextId: " + nextId);
		System.out.println("age: " + age);
		System.out.println("phone: " + phone);
		System.out.println("max int: " + maxValue);
		System.out.println("min int: " + minValue);
		System.out.println("max byte: " + maxValueB);
		System.out.println("min byte: " + minValueB);
	}
	
	public static void main(String[] args) {
	    Student s = new Student();
		s.compute();
	}
}
