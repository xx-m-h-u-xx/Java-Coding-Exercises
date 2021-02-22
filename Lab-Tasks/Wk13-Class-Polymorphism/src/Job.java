/* --  Job class  -- */
public class Job {
	
	/* ---  Class attributes --- */
	Room theRoom;		// declares, calls, fetches object
	float hourlyRate;   // for every job there's an hourly rate charge
	
	/* --- Job constructor --- */
	Job(Room room, float hourlyRate)
	{
		// -- assigns data attributes to its constructor
		this.theRoom = room;
		this.hourlyRate = hourlyRate;
	}
	
	// Job's Method "calculateCost" returns result of the cost
	float calculateCost() {
		
		// goes to object's CLASS method: theRoom.calculateCost
		// and then it passes a parameter value as "hourlyRate" as an argument
		// so it can do the specified calculation
		return (theRoom.calculateCost( hourlyRate ));
		
	}

}