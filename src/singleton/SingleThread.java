package singleton;

public class SingleThread {
	private static SingleThread singleton = null;

	// 限制产生多个对象
	private SingleThread() {
	}

	// 通过该方法获得实例对象
	public static SingleThread getSingleton() {
		if (singleton == null) {
			singleton = new SingleThread();
		}
		return singleton;
	}
}
