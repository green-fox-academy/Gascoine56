import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class SuperHexagon {

    public static void drawImage(Graphics graphics){
        int size = 8;
        int [] xPoints3 = {WIDTH/2 + 15, WIDTH/2 +30, WIDTH/2 + 15, WIDTH/2 -15, WIDTH/2 -30, WIDTH/2 - 15};
        int [] yPoints3 = {HEIGHT - 50, HEIGHT - 30, HEIGHT - 10, HEIGHT - 10, HEIGHT -30, HEIGHT - 50};

        for (int i = 0; i < size/2; i++) {
            int []xPoints = {WIDTH/2 + 15, WIDTH/2 +30, WIDTH/2 + 15, WIDTH/2 -15, WIDTH/2 -30, WIDTH/2 - 15};
            int []yPoints = {HEIGHT - 50, HEIGHT - 30, HEIGHT - 10, HEIGHT - 10, HEIGHT -30, HEIGHT - 50};
            int [] xPoints2 = {WIDTH/2 + 15, WIDTH/2 +30, WIDTH/2 + 15, WIDTH/2 -15, WIDTH/2 -30, WIDTH/2 - 15};
            int [] yPoints2 = {HEIGHT - 50, HEIGHT - 30, HEIGHT - 10, HEIGHT - 10, HEIGHT -30, HEIGHT - 50};
            graphics.drawPolygon(xPoints3, yPoints3, 6);
            for (int j = 0; j < 6; j++) {
                yPoints3[j] -= 40;
                yPoints[j] -= i * 40;
                yPoints2[j] -= i * 40;
            }
            for (int j = 0; j < size/2; j++) {
                for (int k = 0; k < 6; k++) {

                    xPoints[k] = xPoints[k] + 45;
                    yPoints[k] = yPoints[k] - 20;

                    xPoints2[k] = xPoints2[k] - 45;
                    yPoints2[k] = yPoints2[k] - 20;
                }
                graphics.drawPolygon(xPoints, yPoints, 6);
                graphics.drawPolygon(xPoints2, yPoints2, 6);
            }
        }
        int [] xPoints4 = {WIDTH/2 + 15, WIDTH/2 +30, WIDTH/2 + 15, WIDTH/2 -15, WIDTH/2 -30, WIDTH/2 - 15};
        int [] yPoints4 = {310, 290, 270, 270, 290, 310};

        for (int i = 0; i < size/2; i++) {
            int []xPoints = {WIDTH/2 + 15, WIDTH/2 +30, WIDTH/2 + 15, WIDTH/2 -15, WIDTH/2 -30, WIDTH/2 - 15};
            int []yPoints = {310, 290, 270, 270, 290, 310};
            int [] xPoints2 = {WIDTH/2 + 15, WIDTH/2 +30, WIDTH/2 + 15, WIDTH/2 -15, WIDTH/2 -30, WIDTH/2 - 15};
            int [] yPoints2 = {310, 290, 270, 270, 290, 310};
            graphics.drawPolygon(xPoints4, yPoints4, 6);
            for (int j = 0; j < 6; j++) {
                yPoints4[j] += 40;
                yPoints[j] += i * 40;
                yPoints2[j] += i * 40;
            }
            for (int j = 0; j < size/2; j++) {
                for (int k = 0; k < 6; k++) {

                    xPoints[k] = xPoints[k] + 45;
                    yPoints[k] = yPoints[k] + 20;

                    xPoints2[k] = xPoints2[k] - 45;
                    yPoints2[k] = yPoints2[k] + 20;

                }
                graphics.drawPolygon(xPoints, yPoints, 6);
                graphics.drawPolygon(xPoints2, yPoints2, 6);
            }

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