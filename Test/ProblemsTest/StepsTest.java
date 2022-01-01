package ProblemsTest;

import Utils.ProblemTest;
import Utils.TestType;
import com.FCDS.Utils.Problem;
import com.FCDS.Problems.Steps;
import org.junit.jupiter.api.Test;

class StepsTest extends ProblemTest {
    private final Problem problem = new Steps();

    public StepsTest() {
        problem.setTimeLimits(1);
    }
    @Test
    void sampleTest() {
        runTest(problem,"P2/T1_IN.txt","P2/T1_OUT.txt","P2/T1_ANS.txt" , TestType.SIMPLE);
    }
    @Test
    void fullTest() {
        runTest(problem,"P2/T2_IN.txt","P2/T2_OUT.txt","P2/T2_ANS.txt" , TestType.FULL);
    }

}