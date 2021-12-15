import java.io.PrintStream;

public enum TestType {
    SIMPLE("Simple"), FULL("Full");

    public final String label;

    TestType(String label) {
        this.label = label;
    }

}
