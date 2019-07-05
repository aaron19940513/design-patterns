package strategy.analysis;

public class USTax extends CalcTax{
	@Override
	public double taxAmount(long id, double price) {
		return 0;
	}
}
