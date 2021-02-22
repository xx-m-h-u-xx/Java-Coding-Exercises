// main class
public class Test {

	public static void main(String[] args) {
		
		// creating objects fom blueprinted class contructors
		Student stu1 = new Student();
		Student stu2 = new Student("Bob Cherry",50, 80, 80);
		Unit PRGRM = new Unit("Programming", "McClean");
		Unit IS = new Unit("Information Systems", "Gordon");
		
		System.out.println("Name: "+stu1.name+" | "+" Age: "+stu1.age+" | "+" Mark1: "+stu1.mark1+" | "+" Mark2: "+stu1.mark2);
		System.out.println("Name: "+stu2.name+" | "+" Age: "+stu2.age+" | "+" Mark1: "+stu2.mark1+" | "+" Mark2: "+stu2.mark2);
		
		static void displayUnitResults(Unit module) {
			System.out.print("Unit Title: "+module.unitName);
			System.out.print("Unit Lecturer: "+module.lecturer);
			System.out.print("Unit Average: "+module.unitAverages());
			System.out.print("Assessment Test 1 AVE: "+" Average: "module.aveMark1);
			System.out.print("Assessment Test 2 AVE: "+module.aveMark2);
		}
	}

}
