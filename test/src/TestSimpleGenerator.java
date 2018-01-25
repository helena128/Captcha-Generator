import com.picgen.*;
import com.picgen.generators.SimpleGenerator;

public class TestSimpleGenerator {
    public static void main(String... args) {
        SimpleGenerator simpleGenerator = new SimpleGenerator();
        for (int i = 0; i < 10; i++) {
            System.out.println(">>" + simpleGenerator.getCaptchaString(simpleGenerator.generateNumberInRange(5, 7)) + "<<");
        }
    }
}