import com.FCDS.Problems.Problem;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

public abstract class ProblemTest {
    private final String FOLDER_PATH = "Test/Files/";
    protected final Checker checker = new Checker();

    protected Scanner setScanner(String inFile) throws FileNotFoundException {
        File file = new File(FOLDER_PATH + inFile);
        return new Scanner(file);
    }
    protected void setOutputStream(String outFile) throws FileNotFoundException {
        System.setOut(new PrintStream(new FileOutputStream(FOLDER_PATH + outFile)));
    }
    protected void runTest(Problem problem, String inputFile, String outPutFile, String answerFile,TestType type){
        String message = "Wrong Answer in "+ type +" Test";
        try {
            problem.setscanner(setScanner(inputFile));
            setOutputStream(outPutFile);
            int numOfTests = problem.inputScanner.nextInt();
            while (numOfTests-->0)
            {
                problem.run();
                System.out.println();
            }

            assertTrue(checker.integerChecker(outPutFile, answerFile),message);
        }catch (Exception ignored){
            fail(message);
        }
    }
}
