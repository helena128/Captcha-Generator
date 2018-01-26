import com.picgen.GeneratorApplication;
import com.picgen.picture.PicturePainter;

import java.awt.image.BufferedImage;
import java.util.concurrent.TimeUnit;

public class TestPictureBackground {
    public static void main(String... args) {
        go();
    }

    public static void go() {
        BufferedImage img = new PicturePainter().getBufferedImage(200, 300);
        GeneratorApplication app = new GeneratorApplication();
        app.displayImage(img, "Test Background");
    }
}
