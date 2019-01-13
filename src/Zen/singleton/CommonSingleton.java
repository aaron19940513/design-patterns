package Zen.singleton;

public class CommonSingleton {
	private static final CommonSingleton singleton = new CommonSingleton();

	// ���Ʋ����������
	private CommonSingleton() {
	}

	// ͨ���÷������ʵ������
	public static CommonSingleton getSingleton() {
		return singleton;
	}

	// �������������� ������static
	public static void doSomething() {
	}

}
