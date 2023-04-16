package TurtleGraphicsStarDesignInitials;

import java.awt.Graphics;
import java.awt.BasicStroke;
import static java.awt.Color.*;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.image.BufferedImage;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TurtleGraphicsStarDesignInitials {

	public static void main(String[] args) {
        JFrame frame = new JFrame("Turtle Graphics");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        JPanel panel = new TurtlePanel();
        frame.add(panel);
        frame.setVisible(true);
    }
}

class TurtlePanel extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
    	
        // Set the background color to darkred
        this.setBackground(java.awt.Color.decode("#8B0000"));
        
        // Set the turtle's attributes
        g2.setColor(java.awt.Color.GREEN);
        g2.setStroke(new BasicStroke(2));
        double x = 300, y = 300, angle = Math.PI / 2;
        
        // Draw the lines to form the star
        for (int i = 0; i < 13; i++) {
            x += 200 * Math.cos(angle);
            y += 200 * Math.sin(angle);
            g2.draw(new Line2D.Double(x - 200 * Math.cos(angle), y - 200 * Math.sin(angle), x, y));
            angle -= Math.PI / 6;
        }
        
        // Draw the letter S
        g2.setColor(java.awt.Color.decode("#40E0D0"));
        g2.setStroke(new BasicStroke(8));
        g2.draw(new Line2D.Double(250, 250, 200, 250));
        g2.draw(new Line2D.Double(200, 250, 200, 300));
        g2.draw(new Line2D.Double(200, 300, 250, 300));
        g2.draw(new Line2D.Double(250, 300, 250, 350));
        g2.draw(new Line2D.Double(250, 350, 200, 350));
        
        // Draw the letter G
        g2.setColor(java.awt.Color.decode("#191970"));
        g2.setStroke(new BasicStroke(4));
        g2.draw(new Line2D.Double(300, 250, 350, 250));
        g2.draw(new Line2D.Double(350, 250, 350, 300));
        g2.draw(new Line2D.Double(350, 300, 300, 300));
        g2.draw(new Line2D.Double(300, 300, 300, 275));
        g2.draw(new Line2D.Double(300, 275, 315, 275));
        g2.draw(new Line2D.Double(315, 275, 315, 325));
        g2.draw(new Line2D.Double(315, 325, 300, 325));
        
        // Draw the first star
        g2.setColor(java.awt.Color.decode("#2F4F4F"));
        g2.setStroke(new BasicStroke(12));
        double length = 150;
        angle = Math.PI / 5;
        x = 400 + length * Math.cos(angle);
        y = 300 - length * Math.sin(angle);
        g2.draw(new Line2D.Double(400, 300, x, y));
        for (int i = 0; i < 4; i++) {
            x += length * Math.cos(angle + 2 * i * Math.PI / 5);
            y -= length * Math.sin(angle + 2 * i * Math.PI / 5);
            g2.draw(new Line2D.Double(x - length * Math.cos(angle + 2 * i * Math.PI / 5),
                    y + length * Math.sin(angle + 2 * i * Math.PI / 5),
                    x, y));
            y -= length * Math.sin(angle + 2 * i * Math.PI / 5);
            g2.draw(new Line2D.Double(x - length * Math.cos(angle + 2 * i * Math.PI / 5), 
                                      y + length * Math.sin(angle + 2 * i * Math.PI / 5),
                                      x, y));
        }
        
        // reposition pen
        x = 600;
        y = 400;
        
        // draw second star
        g2.setStroke(new BasicStroke(12));
        g2.setColor(java.awt.Color.decode("#C0C0C0"));
        length = 300;
        angle = Math.toRadians(144);
        
        for (int i = 0; i < 5; i++) {
            x += length * Math.cos(angle + 2 * i * Math.PI / 5);
            y -= length * Math.sin(angle + 2 * i * Math.PI / 5);
            g2.draw(new Line2D.Double(x - length * Math.cos(angle + 2 * i * Math.PI / 5), 
                                      y + length * Math.sin(angle + 2 * i * Math.PI / 5),
                                      x, y));
        }
        
        // draw text
        Font font = new Font("Arial", Font.BOLD, 72);
        g2.setFont(font);
        g2.setColor(java.awt.Color.WHITE);
        g2.drawString("SG", 250, 600);
        
        // dispose graphics object
        g2.dispose();
        
        // repaint panel to show changes
        this.repaint();
    }
}
