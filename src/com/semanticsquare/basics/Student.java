/*
	Instance & Static:
	- Declared at class-level 
	- Scope: Entire class
	- Gets default value
	- Cannot be re-initialized directly within class

	Instance: Represents object state

	- Values are unique to object
	- From outside class: Accessible via object reference

	Static:
	 
	- Values are unique to class ~ One copy per class (shared across objects)
	- From outside class: Accessible via Class Name or object reference

	Instance & static variables are also referred to as fields or attributes. Attributes is probably more commonly associated with instance variables. 
*/
class Student {    
	static int compterCount;
    int id;	
    String name;
    String gender;
    int age;
    short rank; //[-128, 127]
    long phone; //Java -- readability we can make underscore for better lisibility

    double gpa; //we can add d at the end of the value like 3.8d but we can omit it because double is the default type
    float gpa2; // here we must add mandatorily 'f' at the end

    char degree; // or char degree = '\u0042'; 0042 == 66 == B (hexadecimal)

    boolean international; 
    double tuitionFee = 12000.0;
    double internationalFee = 5000.0;

    // Integer literals: int literal, long literal
    // int maxValue = Integer.MAX_VALUE; 
    // int minValue = Integer.MIN_VALUE;

    // byte maxValueB = Byte.MAX_VALUE; 
    // byte minValueB = Byte.MIN_VALUE; 

	void compute() {	    
		compterCount++;
		int nextId = id + 1;
		
		if (international) {
			tuitionFee += internationalFee;
		}

	    System.out.println("\nid: " + id);
		System.out.println("nextId: " + nextId);
		System.out.println("name: " + name);
		System.out.println("gender: " + gender);
		System.out.println("age: " + age);
		System.out.println("phone: " + phone); // print 2234567890 instead of 22_345_678_90
		System.out.println("gpa: " + gpa);
		System.out.println("degree: " + degree);
		System.out.println("tuition Fee: " + tuitionFee);
		System.out.println("compter count: " + compterCount);
	}
	
	public static void main(String[] args) {
	    Student student1 = new Student();
	    student1.id = 1000;
	    student1.name = "Cheikh";
	    student1.gender = "male";
	    student1.age = 18;
	    student1.rank = 65;
	    student1.phone = 22_345_678_90L;
	    student1.gpa = 3.8;
	    student1.degree = 'B';
	    student1.international = false;
		student1.compute();

	    Student student2 = new Student();
	    student2.id = 1001;
	    student2.name = "Fatima";
	    student2.gender = "female";
	    student2.age = 20;
	    student2.rank = 60;
	    student2.phone = 22_385_488_90L;
	    student2.gpa = 3.1;
	    student2.degree = 'C';
	    student2.international = true;
		student2.compute();

	    Student student3 = new Student();
	    student3.id = 1002;
	    student3.name = "Anita";
	    student3.gender = "female";
	    student3.age = 20;
	    student3.rank = 60;
	    student3.phone = 22_385_88888L;
	    student3.gpa = 4.0;
	    student3.degree = 'M';
	    student3.international = true;
		student3.compute();

		System.out.println("Student.computeCount: " + Student.compterCount);
	}
}
