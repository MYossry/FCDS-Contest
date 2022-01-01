package ProblemsTest;

import Utils.ProblemTest;
import Utils.TestType;
import com.FCDS.Problems.Difference;
import com.FCDS.Utils.Problem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

class DifferenceTest extends ProblemTest {
    private final Problem problem = new Difference();

    public DifferenceTest() {
        problem.setTimeLimits(1);
    }

    @Test
    void sampleTest() {
        runTest(problem,"P1/T1_IN.txt","P1/T1_OUT.txt","P1/T1_ANS.txt" , TestType.SIMPLE);
    }
    @Test
    void fullTest() {
        runTest(problem,"P1/T2_IN.txt","P1/T2_OUT.txt","P1/T2_ANS.txt" , TestType.FULL);
    }

}