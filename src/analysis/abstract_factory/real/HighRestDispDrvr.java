package analysis.abstract_factory.real;

public class HighRestDispDrvr extends DisplayDriver {

	@Override
	public void draw() {
		DisplayDriver displayDriver = new HRDDDisplayDriver();
		displayDriver.draw();
	}

}
