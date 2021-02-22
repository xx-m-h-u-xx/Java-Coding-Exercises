import java.util.*;
import java.io.*;
public class FileHandleMain {

	public static void main(String[ ] args) {
		
		Scanner scan = null; // default
		
		if ( args.length != 1) {
			System.out.println("Please specify ONE filename in C0MMAND LINE");
			System.exit(0);
		}
		
		// String inputFileName = args[0];
		// String outputFileName = args[1];
		
		try {
			scan = new Scanner(new File(args[0]));
		
		}
		
		// if file isn't located, throws an exception error via catch block
		catch ( FileNotFoundException ex) {
			System.out.println("File Not Valid | Cannot open input file:- " + args[0]);
		}
		
		catch (Exception e) 
		{
			System.out.println("Something else happened..." + e);
		}
	}

}
