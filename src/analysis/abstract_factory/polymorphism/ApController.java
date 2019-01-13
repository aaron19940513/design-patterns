package analysis.abstract_factory.polymorphism;

public class ApController {
    public DisplayDriver displayDriver= null;
    
    public ApController(DisplayDriver displayDriver) {
    	
    }
	public void doDraw() {
		displayDriver.draw();
	}

	public void doPrint() {
	}
}
