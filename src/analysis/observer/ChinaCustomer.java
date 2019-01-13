package analysis.observer;

import java.util.Vector;

public class ChinaCustomer extends Customer {
	static {
		observers = new Vector<>();
	}
	public String getState() {
		return "state";
	}

	public void setState() {

	}
}
