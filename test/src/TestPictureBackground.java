import com.picgen.picture.PicturePainter;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class TestPictureBackground {
    public static void main(String... args) {
        go();
    }

    public static void go() {
        BufferedImage image = new PicturePainter().drawPicture(500, 400, Color.blue.getTransparency());
        JFrame frame = new JFrame();
        JLabel label = new JLabel(new ImageIcon(image));
        frame.getContentPane().add(label, BorderLayout.CENTER);
        frame.setSize(500, 400);
        frame.setVisible(true);
    }
}
