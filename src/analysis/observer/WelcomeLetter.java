package analysis.observer;

public class WelcomeLetter implements Observer{
	public WelcomeLetter() {
		
	}

	@Override
	public void update(Customer customer) {
		System.out.println("发送欢迎邮件"+customer.getState());
	}

}
