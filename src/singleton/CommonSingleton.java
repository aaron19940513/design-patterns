package singleton;

public class CommonSingleton {
	private static final CommonSingleton singleton = new CommonSingleton();

	// 限制产生多个对象
	private CommonSingleton() {
	}

	// 通过该方法获得实例对象
	public static CommonSingleton getSingleton() {
		return singleton;
	}

	// 类中其他方法， 尽量是static
	public static void doSomething() {
	}

}
