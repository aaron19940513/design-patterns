package strategy.analysis;

public class TaskController {
	public void process() {
		CalcTax myTax = getTaxRulesForCountry();
		SalesOrder order = new SalesOrder();
		order.process(myTax);
	}
	
	public CalcTax getTaxRulesForCountry() {
		return new ChinaTax();
	}
	
}
