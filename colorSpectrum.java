package colorSpectrum;

import java.util.Scanner;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class colorSpectrum {

	// Returns the output for the input in spectral
	public static void getSpectral(int spectral) {
	// Create a new JFrame and JPanel
	JFrame frame = new JFrame("Spectral Color");
	JPanel panel = new JPanel();
	
	// Set the size and background color of the panel
	panel.setSize(400, 400);
	panel.setBackground(Color.WHITE);

	// Create a new JLabel for displaying the color
	JLabel colorLabel = new JLabel();
	colorLabel.setHorizontalAlignment(JLabel.CENTER);
	colorLabel.setVerticalAlignment(JLabel.CENTER);

	// If spectral is between 380 and 700, display the corresponding color
	if (spectral >= 380 && spectral <= 700) {
	  // Print the color
	  if (spectral >= 380 && spectral < 450) {
	    System.out.println("The Color is Violet");
	    colorLabel.setText("Violet");
	    colorLabel.setForeground(Color.MAGENTA);
	  } else if (spectral >= 450 && spectral < 485) {
	    System.out.println("The Color is Blue");
	    colorLabel.setText("Blue");
	    colorLabel.setForeground(Color.BLUE);
	  } else if (spectral >= 485 && spectral < 500) {
	    System.out.println("The Color is Cyan");
	    colorLabel.setText("Cyan");
	    colorLabel.setForeground(Color.CYAN);
	  } else if (spectral >= 500 && spectral < 565) {
	    System.out.println("The Color is Green");
	    colorLabel.setText("Green");
	    colorLabel.setForeground(Color.GREEN);
	  } else if (spectral >= 565 && spectral < 590) {
	    System.out.println("The Color is Yellow");
	    colorLabel.setText("Yellow");
	    colorLabel.setForeground(Color.YELLOW);
	  } else if (spectral >= 590 && spectral < 625) {
	    System.out.println("The Color is Orange");
	    colorLabel.setText("Orange");
	    colorLabel.setForeground(Color.ORANGE);
	  } else if (spectral >= 625 && spectral <= 700) {
	    System.out.println("The Color is Red");
	    colorLabel.setText("Red");
	    colorLabel.setForeground(Color.RED);
	  }
	  
	  // Set the font style for the color label
	  Font font = new Font("Courier", Font.ITALIC, 90);
	  colorLabel.setFont(font);
	  
	} else {
	  // Print an error message if the input is not in the range of 380-700
	  System.out.println("The Input You Have Entered is Not Recognized." 
	            + "\nPlease Input a Number Ranging From 380 - 700. Thank You!!!");
	}

	// Add the color label to the panel and set the panel to the content pane of the frame
	panel.add(colorLabel);
	frame.setContentPane(panel);

	// Set the size and visibility of the frame
	frame.setSize(400, 400);
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}
	
	// Main function
	public static void main(String[] args) {
	// Ask the user to input a spectrum number ranging from 380-700
	Scanner scanner = new Scanner(System.in);
	System.out.print("Please Enter a Spectral Color in Wavelength nano-meters (nm) Ranging From 380-700: ");
	int spectral = scanner.nextInt();
	
	// Call getSpectral(spectral) if the input is between 380-700
	if (spectral >= 380 && spectral <= 700) {
	getSpectral(spectral);
	} else {
	System.out.println("The Input You Have Entered is Not Recognized.\n" +
	"Please Input a Number Ranging From 380 - 700. Thank You!!!");
	
		}
	}	
}
