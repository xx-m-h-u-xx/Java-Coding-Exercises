/*--- Superclass Room   ---*/
public class Room {
	
	// defines class attributes
	int area;
	int time;
	float unitCost;
	
	// Room constructor, constructs an object of the class
	Room(int area, int time, float unitCost)
	{
		this.area = area;
		this.time= time;
		this.unitCost = unitCost;
	}
	
	// Room's Method with added passed info as "hourlyRate"
	float calculateCost( float hourlyRate)
	{
		// returns below computed value
		return time*hourlyRate + unitCost*area;
	}
	
}
