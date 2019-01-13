package analysis.abstract_factory.real;

public class HighRestFact extends RestFactory {

	@Override
	public DisplayDriver getDisDrvr() {
		return new HighRestDispDrvr();
	}

	@Override
	public PrintDriver getprtDrvr() {
		return null;
	}

}
