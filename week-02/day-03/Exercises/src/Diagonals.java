import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Diagonals {
    public static void drawImage(Graphics graphics) {
        // Create a function that draws a single line
        // Use this function to draw the canvas' diagonals
        // If the line starts from the upper-left corner it should be green, otherwise it should be red
        // Make decision about the color in the function

        Random random = new Random();

        int x = random.nextInt(WIDTH);
        int y = random.nextInt(HEIGHT);

        diagonals(x, y,graphics);



    }

    private static void diagonals(int x, int y, Graphics graphics) {


        if(x == 0 && y == 0){
            graphics.setColor(Color.GREEN);
            graphics.drawLine(x, y, WIDTH, HEIGHT);
        }
        else{
            graphics.setColor(Color.RED);
            graphics.drawLine(x, y, WIDTH, HEIGHT);
        }


    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            drawImage(graphics);
        }
    }
}