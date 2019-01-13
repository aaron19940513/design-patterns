package analysis.abstract_factory.real;

public class LowRestDispDrvr extends DisplayDriver {

	@Override
	public void draw() {
		DisplayDriver displayDriver = new LRDDDisplayDriver();
		displayDriver.draw();
	}

}
