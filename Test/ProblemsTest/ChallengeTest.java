package ProblemsTest;

import Utils.ProblemTest;
import Utils.TestType;
import com.FCDS.Problems.Challenge;
import com.FCDS.Utils.Problem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

class ChallengeTest extends ProblemTest {
    private final Problem problem = new Challenge();

    public ChallengeTest() {
        problem.setTimeLimits(6.5);
    }

    @Test
    void sampleTest() {

        runTest(problem,"P4/T1_IN.txt","P4/T1_OUT.txt","P4/T1_ANS.txt" , TestType.SIMPLE);
    }
    @Test
    void fullTest() {
        runTest(problem,"P4/T2_IN.txt","P4/T2_OUT.txt","P4/T2_ANS.txt" , TestType.FULL);
    }

}