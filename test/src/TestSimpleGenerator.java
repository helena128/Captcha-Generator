import com.picgen.*;
import com.picgen.generators.SimpleGenerator;

/**
 * Tests for the generated key
 */
public class TestSimpleGenerator {

    public static void main(String... args) {
        SimpleGenerator simpleGenerator = new SimpleGenerator();
        for (int i = 0; i < 10; i++) {
            System.out.println(">>" + simpleGenerator.getCaptchaString(5, 6) + "<<");
        }
    }
}