import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {
    public static void drawImage(Graphics graphics) {
        // Fill the canvas with a checkerboard pattern

        int size = 40;
        graphics.setColor(Color.BLACK);
        for (int i = 0; i < WIDTH/size/2; i++) {
            for (int j = 0; j < HEIGHT/size/2; j++) {
                graphics.fillRect(2 * i * size,2 * j * size,size,size);
            }
            for (int j = 0; j < HEIGHT/size/2; j++) {
                graphics.fillRect(size + 2 * i * size,size + 2 * j * size,size,size);
            }




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