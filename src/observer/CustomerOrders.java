package analysis.observer;

public class CustomerOrders {
	public void process(Customer customer) {
		customer.notifyObs();
	}
}
