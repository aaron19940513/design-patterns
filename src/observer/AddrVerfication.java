package analysis.observer;

public class AddrVerfication implements Observer {
	public AddrVerfication() {
	}

	@Override
	public void update(Customer customer) {
		System.out.println("向邮局查证消费者的地址");
	}

}
