package qa.guru;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class ExampleTest {
    @Test
    void exampleTest00(){
        Assertions.assertTrue(new Random().nextInt() > 1);

    }
    @Test
    void exampleTest01(){
        Assertions.assertTrue(new Random().nextInt() > 2);

    }

}
