import exercises.dominoes.Vector2D;
import org.junit.jupiter.api.Test;

public class Vector2DTest {

    @Test
    public void testNormalize() {
        Vector2D v = new Vector2D(1.0f, 2.0f);
        v.normalize();



        System.out.println(v);
    }
}
