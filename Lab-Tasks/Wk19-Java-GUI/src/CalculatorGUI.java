import javax.swing.*;

public class CalculatorGUI {

	public static void main(String[] args) {
		// creates an instance of JFrame - a swing window
        JFrame f = new JFrame("CalculatorGUI");
        f.setSize( 600, 300 );
        f.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        
        // adds an instance member of CalculatorPanel
        f.add( new CalculatorPanel() );
        f.setVisible(true);
    }
}