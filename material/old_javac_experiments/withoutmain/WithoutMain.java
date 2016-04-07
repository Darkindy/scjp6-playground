// Executes successfully in java 6 and lower, but not in java 7+
public class WithoutMain {
	static {
		System.out.println("Hello, world!");
		System.exit(0); // not needed, but doesn't show error anymore
	}
}