// Unit class
import java.util.ArrayList;
public class Unit {
	
	// declares variables
	String unitName, lecturer;
	float aveMark1, aveMark2, aveUnit;
	int classSize=0;
	ArrayList<Student>StudentList;   // array-type named as "StudentList" 
	
	// declares constructor
	Unit() {
		StudentList = new ArrayList<Student>();
		
	}
	
	// declares overloaded constructor with passed parameters
	Unit(String unitName, String lecturer) {
		StudentList = new ArrayList<Student>();    // creates new arraylist
		this.unitName = unitName;
		this.lecturer = lecturer;
	}
	
	// adding addStudent method
	void addStudent(Student member) {
		StudentList.add(member);       // adds student instance "member" to array, StudentList
		classSize++;                   // increments classSize by 1
	}
	
	// adding unitAverage method
	float unitAverages() {
		
		// declaring private variable and its type
		int totalMark1 = 0;
		int totalMark2 = 0;
		
		// iteration 
		for(Student member: StudentList) {
			totalMark1 = totalMark1 + member.mark1;
			totalMark2 = totalMark1 + member.mark2; 
		}
		
		aveMark1 = (float)totalMark1 /classSize;  // variable aveMark1 stores casted calculation 
		aveMark2 = (float)totalMark2 / classSize; // variable aveMark2 stores casted calculation
		aveUnit = (aveMark1+aveMark2)/2.0f;       // aveUnit stores both the averaged marks divided by 2.0f 
		return aveUnit;                           // returns aveUnit (transferring back to the initial caller)
	
	} // end of unitAverages method
}
