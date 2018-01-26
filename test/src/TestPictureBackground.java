import com.picgen.picture.PicturePainter;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class TestPictureBackground {
    public static void main(String... args) {
        go();
    }

    public static void go() {
        BufferedImage img = new PicturePainter().getBufferedImage(200, 300);
        JFrame frame = new JFrame();
        frame.getContentPane().setLayout(new FlowLayout());
        frame.getContentPane().add(new JLabel(new ImageIcon(img)));
        frame.setSize(250, 250);
        frame.setVisible(true);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
