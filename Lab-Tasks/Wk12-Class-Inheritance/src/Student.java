// Student class
public class Student {
	String name;
	int age;
	int mark1, mark2;
	
	// declares constructor 
	Student() {
		name="unknown";
		age=18;
		mark1=0;
		mark2=0;
	}
	
	// declares overloaded constructor with passed parameters
	Student(String name, int age, int mark1, int mark2) {
		this.name = name;
		this.age = age;
		this.mark1 = mark1;
		this.mark2 = mark2;
	}
}
