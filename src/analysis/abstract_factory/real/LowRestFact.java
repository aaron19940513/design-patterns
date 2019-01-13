package analysis.abstract_factory.real;

public class LowRestFact extends RestFactory{
	
	@Override
	public DisplayDriver getDisDrvr() {
			return new LowRestDispDrvr();
	}

	@Override
	public PrintDriver getprtDrvr() {
		// TODO Auto-generated method stub
		return null;
	}

}
