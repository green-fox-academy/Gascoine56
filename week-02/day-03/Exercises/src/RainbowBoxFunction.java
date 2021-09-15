import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {
    public static void drawImage(Graphics graphics) {
        // Create a square drawing function that takes 3 parameters
        // (the square size, the fill color and the graphics)
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares (red, orange, yellow, green, blue, indigo, violet).

        int x = 100;
        Color color[] = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN,Color.BLUE,new Color(11, 21, 68, 255), new Color(110, 41, 138)};
        rainbowBox(x, color, graphics);

    }

    private static void rainbowBox(int x, Color[] color, Graphics graphics) {
        Random random = new Random();
        int xAx = random.nextInt(WIDTH);
        int yAX = random.nextInt(HEIGHT);
        for (int i = 0; i < color.length; i++) {
            graphics.setColor(color[i]);
            graphics.fillRect(xAx, yAX, x, x);
            xAx = random.nextInt(WIDTH);
            yAX = random.nextInt(HEIGHT);

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
