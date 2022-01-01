package ProblemsTest;

import Utils.ProblemTest;
import Utils.TestType;
import com.FCDS.Problems.OddIncEvenDec;
import com.FCDS.Utils.Problem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

class OddIncEvenDecTest extends ProblemTest {
    private final Problem problem = new OddIncEvenDec();

    public OddIncEvenDecTest() {
        problem.setTimeLimits(3);
    }
    @Test
    void sampleTest() {
        runTest(problem,"P3/T1_IN.txt","P3/T1_OUT.txt","P3/T1_ANS.txt" , TestType.SIMPLE);
    }
    @Test
    void fullTest() {
        runTest(problem,"P3/T2_IN.txt","P3/T2_OUT.txt","P3/T2_ANS.txt" , TestType.FULL);
    }

}