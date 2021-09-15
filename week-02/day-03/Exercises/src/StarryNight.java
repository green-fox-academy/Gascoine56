
import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class StarryNight {
    public static void drawImage(Graphics graphics) {
        // Draw the night sky:
        //  - The background should be black
        //  - The stars can be small squares
        //  - The stars should have random positions on the canvas
        //  - The stars should have random color (some shade of grey)
        Random random = new Random();
        int size = random.nextInt(20);
        Color [] colors = {Color.DARK_GRAY, Color.gray,Color.LIGHT_GRAY,Color.WHITE, Color.YELLOW};
        int colorIndex = random.nextInt(colors.length);
        int x = random.nextInt(WIDTH);
        int y = random.nextInt(HEIGHT);
        for (int i = 0; i < 50; i++) {
            graphics.setColor(colors[colorIndex]);
            graphics.fillRect(x, y, size, size);
             colorIndex = random.nextInt(colors.length);
             x = random.nextInt(WIDTH);
             y = random.nextInt(HEIGHT);
            size = random.nextInt(20);
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
            this.setBackground(Color.black);
        }
    }
}