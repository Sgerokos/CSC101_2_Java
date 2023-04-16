package practiceStar;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class practiceStar {

    public static void main(String[] args) {
        // Creating a JFrame and a JPanel
        JFrame frame = new JFrame();
        JPanel panel = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);

                // Designing the letter S
                Color turquoise = new Color(64, 224, 208);
                g.setColor(turquoise);
                g.fillRect(50, 50, 8, 50);
                g.fillRect(50, 50, 50, 8);
                g.fillRect(50, 92, 50, 8);
                g.fillRect(92, 92, 8, 50);

                // Drawing the letter G
                Color midnightBlue = new Color(25, 25, 112);
                g.setColor(midnightBlue);
                g.drawLine(150, 50, 200, 50);
                g.drawLine(150, 50, 150, 100);
                g.drawLine(150, 100, 200, 100);
                g.drawLine(200, 100, 185, 80);
                g.drawLine(185, 80, 165, 80);
                g.drawLine(165, 80, 165, 95);
                g.drawLine(165, 95, 200, 95);
            }
        };

        // Setting the background color of the JPanel to white
        panel.setBackground(Color.WHITE);

        // Adding the JPanel to the JFrame
        frame.add(panel);

        // Setting the size of the JFrame and making it visible
        frame.setSize(250, 200);
        frame.setVisible(true);
    }
}