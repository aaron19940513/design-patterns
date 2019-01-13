package analysis.abstract_factory.real;

public class Test {
	public static void main(String[] args) {
		// RestFactory factory = new LowRestFact();
		RestFactory factory = new HighRestFact();
		DisplayDriver displayDriver = factory.getDisDrvr();
		displayDriver.draw();
	}
}
