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
	static int studentCount;
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

	Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	Student(int newId, String newName, String newGender, int newAge, short newRank, long newPhone, double newGpa, char newDegree) {
		this(newId, newName, newGender, newAge, newRank, newPhone, newGpa, newDegree, false);
	}
	
	Student(int id, String name, String gender, int age, short rank, long phone, double gpa, char degree, boolean international) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.rank = rank;
		this.phone = phone;
		this.gpa = gpa;
		this.degree = degree;
		this.international = international;
		
		studentCount++;
		int nextId = id + 1;
		
		if (international) {
			tuitionFee += internationalFee;
		}

	    System.out.println("\nid: " + this.id);
		System.out.println("nextId: " + nextId);
		System.out.println("name: " + this.name);
		System.out.println("gender: " + this.gender);
		System.out.println("age: " + this.age);
		System.out.println("phone: " + this.phone); // print 2234567890 instead of 22_345_678_90
		System.out.println("gpa: " + this.gpa);
		System.out.println("degree: " + this.degree);
		System.out.println("tuition Fee: " + tuitionFee);
		System.out.println("Student count: " + studentCount);
	}
	
	boolean updateProfile(String name) {
		this.name = name;
		return true;
	}

    // Integer literals: int literal, long literal
    // int maxValue = Integer.MAX_VALUE; 
    // int minValue = Integer.MIN_VALUE;

    // byte maxValueB = Byte.MAX_VALUE; 
    // byte minValueB = Byte.MIN_VALUE; 

	public static void main(String[] args) {
	    Student student1 = new Student(1000, "John", "male", 18, (short) 65, 22_345_678_90L, 3.8, 'B', false);

	    Student student2 = new Student(1001, "Fatima", "female", 20, (short) 60, 22_385_488_90L, 3.1, 'C', true);

	    Student student3 = new Student(1002, "Anita", "female", 20, (short) 62, 22_385_88888L, 4.0, 'M', true);

		System.out.println("Student.studentCount: " + Student.studentCount);
		System.out.println("\nStudent 1: " + student1.name);
		System.out.println("\nStudent 2: " + student2.name);
		System.out.println("\nStudent 3: " + student3.name);
		
		student1.updateProfile("Cheikh");
		
		System.out.println("\nStudent 1: " + student1.name);
	}
}
