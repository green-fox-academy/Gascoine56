import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Exercise1 {

    public static void drawImage(Graphics graphics){
       //top point
       int x1 = WIDTH/2;
       int y1 = 0;
       //left point
       int x2 =  0;
       int y2 = HEIGHT;
       //right point
       int x3 = WIDTH;
       int y3 = HEIGHT;

       int d = WIDTH/20;

        for (int i = 0; i < 25; i++) {
            graphics.drawLine(x2 + d*i/2, y2 - i*d, x3 - d*i/2, y3 - i*d);
        }
        for (int i = 0; i < 25; i++) {
            graphics.drawLine(x2 + i*d, y2, x1 + i * d/2, y1 + i*d);
        }
        for (int i = 0; i < 25; i++) {
            graphics.drawLine(x1 - i*d/2 , y1 + i*d, x3 - i*d, y3);
        }
    }

    // Don't touch the code below
    static int WIDTH = 640;
    static int HEIGHT = 640;

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