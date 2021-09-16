import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class LinePlay {

        public static void drawImage(Graphics graphics){
            //purple lines
            int x1 = WIDTH - 50;
            int y1 = 50;
            int x2 = WIDTH - 10;
            int y2 = HEIGHT - 50;
            graphics.setColor(new Color(119, 73, 164));
            for (int i = 0; i < 14; i++) {
                graphics.drawLine(x1 - i*40, y1, x2, y2 - i * 40);
            }

            //green lines
            int x3 = 50;
            int y3 = HEIGHT - 10;
            int x4 = 10;
            int y4 = 80;
            graphics.setColor(Color.GREEN);
            for (int i = 0; i < 14; i++) {
                graphics.drawLine(x3 + i * 40, y3 , x4, y4 + i* 40);
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