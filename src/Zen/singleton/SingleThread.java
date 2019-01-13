package Zen.singleton;

public class SingleThread {
	private static SingleThread singleton = null;

	// ���Ʋ����������
	private SingleThread() {
	}

	// ͨ���÷������ʵ������
	public static SingleThread getSingleton() {
		if (singleton == null) {
			singleton = new SingleThread();
		}
		return singleton;
	}
}
