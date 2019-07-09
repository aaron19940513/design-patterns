package observer.analysis;



public class Test {
	public static void main(String[] args) {
		CustomerOrders customerOrders = new CustomerOrders();
		Customer customer = getCustomerForCountry("1");
		customerOrders.process(customer);
		customer = getCustomerForCountry("2");    
		customerOrders.process(customer);
	}

	public static Customer getCustomerForCountry(String type) {
		Customer customer = null;
		if (type.equals("1")) {
			customer = new ChinaCustomer();
			customer.attach(new WelcomeLetter());
		}
		if (type.equals("2")) {
			customer = new USACustomer();
			customer.attach(new AddrVerfication());
		}
		return customer;
	}
}
