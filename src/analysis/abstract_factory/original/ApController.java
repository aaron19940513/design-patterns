package analysis.abstract_factory.original;

public class ApController {

	public static String RESOLUTION = "";

	public static final String LOW = "1";
	
	public static final String HIGH = "2";

	public void doDraw() {
		switch (RESOLUTION) {
		case LOW:
			System.out.println("use lrdd");
		case HIGH:
			System.out.println("use hrdd");
		}
	}

	public void doPrint() {
		switch (RESOLUTION) {
		case LOW:
			System.out.println("use lrpd");
			// use lrpd
		case HIGH:
			System.out.println("use hrpd");
			// use hrpd
		}
	}
}
