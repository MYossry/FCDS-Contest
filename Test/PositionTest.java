import com.FCDS.Problems.Position;
import com.FCDS.Problems.Problem;
import org.junit.jupiter.api.Test;



class PositionTest extends ProblemTest {
    private final Problem problem = new Position();
    @Test
    void sampleTest() {

        runTest(problem,"P5/T1_IN.txt","P5/T1_OUT.txt","P5/T1_ANS.txt" , TestType.SIMPLE);
    }
    @Test
    void fullTest() {
        runTest(problem,"P5/T2_IN.txt","P5/T2_OUT.txt","P5/T2_ANS.txt" , TestType.FULL);
    }
}