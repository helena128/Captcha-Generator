import com.picgen.GeneratorApplication;
import com.picgen.picture.PicturePainter;
import com.picgen.picture.PictureWriter;

import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * Tests writing on the pic
 */
public class TestPictureWriter {
    public static void main(String... args) throws IOException {
        go();
    }

    public static void go() {
        BufferedImage image = new PicturePainter().getBufferedImage(500, 400);
        image = new PictureWriter().writeKeyWord(image, "Hello!");
        GeneratorApplication app = new GeneratorApplication();
        app.displayImage(image, "Test Write");
    }
}
