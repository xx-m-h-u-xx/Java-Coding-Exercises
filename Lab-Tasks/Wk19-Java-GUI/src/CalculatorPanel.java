import javax.swing.*;
import java.awt.event.*;

public class CalculatorPanel extends JPanel implements ActionListener {
	
	JTextField inputDayTxt;
	JTextField inputMonthTxt;
	JTextField inputYearTxt;
	JLabel outputDayLbl;
	JLabel outputMonthLbl;
	JLabel outputYearLbl;
	JLabel outputAnswerLbl;
	JButton getButton;
	
	CalculatorPanel() {
		
		inputDayTxt = new JTextField(2);
		inputMonthTxt = new JTextField(2);
		inputYearTxt = new JTextField(4);
	    outputDayLbl = new JLabel("Day: ");
	    outputMonthLbl = new JLabel("Month: ");
	    outputYearLbl = new JLabel("Year: ");
	    outputAnswerLbl = new JLabel("Answer: ");
	  
	    getButton = new JButton("Get Day");
	    getButton.addActionListener(this);

	    // constructs the inputs/outputs to the panel
	    add(outputDayLbl);
	    add(inputDayTxt);
	    add(outputMonthLbl);
	    add(inputMonthTxt);
	    add(outputYearLbl);
	    add(inputYearTxt);
	    add(getButton);
	    add(outputAnswerLbl);
	}
	
	enum days {
		SUNDAY, MONDAY, TUESDAY, WEDNESDAY,THURSDAY, FRIDAY, SATURDAY
	};

	@Override
	public void actionPerformed(ActionEvent event) {
    		
		try {
			// retrieves the input fields
	    	int day = (int) Float.parseFloat( inputDayTxt.getText() ); 
	    	int month = (int) Float.parseFloat( inputMonthTxt.getText() );
	    	int year = (int) Float.parseFloat(inputYearTxt.getText() );
	    	int dayOfWeek = Doomsday.GetDayOfWeek(day, month, year);
			
	    	if (dayOfWeek == -1) {
	    		outputAnswerLbl.setText(day+"/"+month+"/"+year+" is an INVALID date 😞");
	    	}
	    	
	    	// if the event's source detects the getButton
	        if (event.getSource() == getButton) {
	        	// checks different switch cases
	        	switch(dayOfWeek) {
	        		// cases converts integer days to string literal
	        		case 0: outputAnswerLbl.setText(day+"/"+month+"/"+year+" is a " + days.SUNDAY);
	                		break;
	                
	            	case 1: outputAnswerLbl.setText(day+"/"+month+"/"+year+" is a " + days.MONDAY);
	            			break;
	            	
	            	case 2: outputAnswerLbl.setText(day+"/"+month+"/"+year+" is a " + days.TUESDAY);
	            			break;
	            	
	            	case 3: outputAnswerLbl.setText(day+"/"+month+"/"+year+" is a " + days.WEDNESDAY);
	            			break;
	            	
	            	case 4: outputAnswerLbl.setText(day+"/"+month+"/"+year+" is a " + days.THURSDAY);
	            			break;
	            	
	            	case 5: outputAnswerLbl.setText(day+"/"+month+"/"+year+" is a " + days.FRIDAY);
	            			break;
	            	
	            	case 6: outputAnswerLbl.setText(day+"/"+month+"/"+year+" is a " + days.SATURDAY);
	            			break;
	                }
	            }
	    	} 
	    catch (Exception e) 
	    {
	    	outputAnswerLbl.setText(">>>> Invalid input <<<<"); 
	    }
	 }
}
