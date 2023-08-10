class Student {    
    int id = 1000;	
	byte age = 18;
    short rank = 165; //[-128, 127]
    long phone = 22_345_678_90L; //Java -- readability we can make underscore for better lisibility

    double gpa = 3.8; //we can add d at the end of the value like 3.8d but we can omit it because double is the default type
    float gpa2 = 3.8f; // here we must add mandatorily 'f' at the end

    // Integer literals: int literal, long literal
    // int maxValue = Integer.MAX_VALUE; 
    // int minValue = Integer.MIN_VALUE;

    // byte maxValueB = Byte.MAX_VALUE; 
    // byte minValueB = Byte.MIN_VALUE; 

	void compute() {	    
		int nextId = id + 1;
		
	    System.out.println("id: " + id);
		System.out.println("nextId: " + nextId);
		System.out.println("age: " + age);
		System.out.println("phone: " + phone); // print 2234567890 instead of 22_345_678_90
		System.out.println("gpa: " + gpa);
	}
	
	public static void main(String[] args) {
	    Student s = new Student();
		s.compute();
	}
}
