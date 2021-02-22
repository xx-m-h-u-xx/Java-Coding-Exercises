/* imports the Scanner class */
import java.util.Scanner;

/* --- [MAIN] Decorator class --- */
public class Decorator {

	public static void main(String[] args) {
	
	   /* declares variable and its types */
		float unitCost, hourlyRate;
		int area, time, groutingCharge;
		
	   // initialises & declares "scan" instance for Scanner class
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a hourly rate: ");
	   // reads in the next float-typed number
	   // assigns the value into hourlyRate
		hourlyRate = scan.nextFloat();
		hourlyRate = hourlyRate*3/2;    // increases for the extra work involved: 3/2 = 1.5
		
		System.out.print("Enter size of area: ");
	  // reads in the next integer-type number
	  // stores it in variable called: "area"
		area = scan.nextInt();
		groutingCharge = area;          // assigns variable "groutingCharge" with the value in "area"
		
		System.out.print("Enter unit cost: ");
	  // reads in the next float-type number
	  // stores it in variable "unitCost"
		unitCost = scan.nextFloat();
		
		System.out.print("Enter time: ");
	   // reads in the next integer-type number
	   // stores it in variable "time"
		time = scan.nextInt();
		
		
	   /* --- Instantiating object members  with passed parameter info  */
		TiledRoom anotherRoom = new TiledRoom(area, time, unitCost, groutingCharge);
		Job myJob = new Job(anotherRoom, hourlyRate);
		
		// variable directs to the object's (myJob) method (from its own class (Job) template)
		// and accesses the method "calculateCost()" to calculate the cost of the job 
		float cost = myJob.calculateCost();
		
		// concatenates value stored in "cost" with a message
		System.out.println("The job will cost: £"+cost+"0");
	
	}

}
