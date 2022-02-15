package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String flavor = JOptionPane.showInputDialog(null, "whats your favorite flavor? :D ");
	
		Popcorn popcorn = new Popcorn(flavor);
		
		Microwave microwave = new Microwave();
 
		microwave.putInMicrowave(popcorn);

		String time = JOptionPane.showInputDialog(null, "How many minutes do you want to cook your popcorn?");
	int cookTimeInMinutes = Integer.parseInt(time);	
		microwave.setTime(cookTimeInMinutes);
		
	microwave.startMicrowave();
		
	}

}
