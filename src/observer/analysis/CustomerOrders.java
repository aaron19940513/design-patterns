package observer.analysis;

public class CustomerOrders {
	public void process(Customer customer) {
		customer.notifyObs();
	}
}
