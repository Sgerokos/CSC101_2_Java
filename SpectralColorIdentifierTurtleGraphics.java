package SpectralColorIdentifierTurtleGraphics;

import java.awt.Color;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class SpectralColorIdentifierTurtleGraphics {

	public static void main(String[] args) {
	    // Creating a JFrame and a JPanel
	    JFrame frame = new JFrame();
	    JPanel panel = new JPanel();

	    // Adding the JPanel to the JFrame
	    frame.add(panel);

	    // Creating a scanner object to get user input
	    Scanner scanner = new Scanner(System.in);

	    // Ask's the user to input a spectral number ranging from 380 - 700
	    System.out.print("Please Enter a Spectral Color in Wavelength nano-meters (nm) Ranging From 380-700: ");
	    int spectral = scanner.nextInt();

	    // Prints the color if the number is between 380 and 700
	    if (spectral >= 380 && spectral <= 700) {
	        Color color;
	        String name;
	        if (spectral < 450) {
	            color = new Color(148, 0, 211);
	            name = "Violet";
	        } else if (spectral < 485) {
	            color = Color.BLUE;
	            name = "Blue";
	        } else if (spectral < 500) {
	            color = new Color(0, 255, 255);
	            name = "Cyan";
	        } else if (spectral < 565) {
	            color = Color.GREEN;
	            name = "Green";
	        } else if (spectral < 590) {
	            color = Color.YELLOW;
	            name = "Yellow";
	        } else if (spectral < 625) {
	            color = Color.ORANGE;
	            name = "Orange";
	        } else {
	            color = Color.RED;
	            name = "Red";
	        }

	        System.out.println("The Color is " + name);

	        // Setting the background color of the JPanel to the spectral color
	        panel.setBackground(color);

	        // Creating a new JFrame to display the color name
	        JFrame colorFrame = new JFrame();
	        JPanel colorPanel = new JPanel();
	        colorFrame.add(colorPanel);

	        // Setting the background color of the colorPanel to white
	        colorPanel.setBackground(Color.WHITE);

	        // Setting the size of the colorFrame and making it visible
	        colorFrame.setSize(500, 200);
	        colorFrame.setVisible(true);

	        // Displaying the color name in the colorFrame
	        Color textColor = Color.BLACK;
	        String font = "Courier";
	        int size = 90;
	        int style = Font.ITALIC;
	        JLabel label = new JLabel(name, SwingConstants.CENTER);
	        label.setForeground(textColor);
	        label.setFont(new Font(font, style, size));
	        colorPanel.add(label);

	    } else {
	        System.out.println("The Input You Have Entered is Not Recognized." 
	              + "\nPlease Input a Number Ranging From 380 - 700. Thank You!!!");
	    }

	    // Setting the size of the JFrame and making it visible
	    frame.setSize(500, 500);
	    frame.setVisible(true);
	}
}
