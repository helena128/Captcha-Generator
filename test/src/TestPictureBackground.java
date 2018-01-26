import com.picgen.picture.PicturePainter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.util.concurrent.TimeUnit;

public class TestPictureBackground {
    public static void main(String... args) {
        go();
    }

    public static void go() {
        BufferedImage img = new PicturePainter().getBufferedImage(200, 300);
        JFrame frame = new JFrame();
        frame.getContentPane().setLayout(new FlowLayout());
        frame.getContentPane().add(new JLabel(new ImageIcon(img)));
        frame.setSize(300, 200);
        frame.setVisible(true);
        frame.pack();
        frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));

    }
}
