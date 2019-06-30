package analysis.sington;

public class Sington {
	
	private Sington() {
		
	}
	public static Sington getInstance() {
		return Instance.sington;
	}
	private static class Instance {
		static final Sington sington = new Sington();
	}
	
}
