/*--- inherited childclass/subclass named TiledRoom ---*/
// command "extend" inherits parentclass/superclass Room

public class TiledRoom extends Room {
	
	int groutingCharge = area;   // £1 per unit area
	
	/* --- TiledRoom class constructor --- */
	// constructs object of the class and creates a place in memory
	TiledRoom(int area, int time, float unitCost, int groutingCharge) {
		
		// --- calls superclass constructor ---
		super(area, time, unitCost);
		
		// assigns value in variable "groutingCharge" as the value in "area" 
		this.groutingCharge = area;
	}
	
	/* --- overrides the base parent class method ---
	 * method "calculateCost" has a passed parameter info assigned
	 * --- returns the result to the function */
	
	@Override
	float calculateCost( float hourlyRate )
	{
		// returns the calculated result
		return super.calculateCost(hourlyRate) + groutingCharge;
		// return  (unitCost*area) + time*(hourlyRate) + groutingCharge;
	}
}