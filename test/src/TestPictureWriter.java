import com.picgen.picture.PicturePainter;
import com.picgen.picture.PictureWriter;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class TestPictureWriter {
    public static void main(String... args) throws IOException {
        go();
    }

    public static void go() throws IOException {
        BufferedImage image = new PicturePainter().drawPicture(500, 400, 127);
        image = new PictureWriter().writeKeyWord(image, "Hi");
        JFrame frame = new JFrame();
        JLabel label = new JLabel(new ImageIcon(image));
        frame.getContentPane().add(label, BorderLayout.CENTER);
        frame.setSize(500, 400);
        frame.setVisible(true);
    }
}
