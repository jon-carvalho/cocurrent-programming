import com.study.concurrentprogramming.controller.JavaParallelController;
import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutionException;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class JavaParallelTest {

    private JavaParallelController javaParallelController;
    @Test
    public void doSomeTest() throws ExecutionException, InterruptedException {

        String getting = javaParallelController.testJavaParallel();

        String test = "[\n" +
                "     Id: 1\n" +
                "     Account Owner: JONATAS\n" +
                "     Payback Value: 20\n" +
                "]\n" +
                "[\n" +
                "     Id: 2\n" +
                "     Account Owner: MARIA\n" +
                "     Payback Value: 37\n" +
                "]\n" +
                "[\n" +
                "     Id: 3\n" +
                "     Account Owner: JULIA\n" +
                "     Payback Value: 45\n" +
                "]\n" +
                "[\n" +
                "     Id: 4\n" +
                "     Account Owner: RICARDO\n" +
                "     Payback Value: 115\n" +
                "]\n" +
                "[\n" +
                "     Id: 5\n" +
                "     Account Owner: ANA\n" +
                "     Payback Value: 45\n" +
                "]\n" +
                "[\n" +
                "     Id: 6\n" +
                "     Account Owner: DAEMON\n" +
                "     Payback Value: 3\n" +
                "]\n" +
                "[\n" +
                "     Id: 7\n" +
                "     Account Owner: JON\n" +
                "     Payback Value: 89\n" +
                "]\n" +
                "[\n" +
                "     Id: 8\n" +
                "     Account Owner: TYRION\n" +
                "     Payback Value: 915\n" +
                "]\n" +
                "[\n" +
                "     Id: 9\n" +
                "     Account Owner: ALICE\n" +
                "     Payback Value: 367\n" +
                "]\n" +
                "[\n" +
                "     Id: 10\n" +
                "     Account Owner: FERNANDA\n" +
                "     Payback Value: 65\n" +
                "]\n" +
                "\n" +
                "Processing time: 2067\n";

        assertTrue(test == getting);

    }
}
