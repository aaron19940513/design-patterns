package singleton;

public class MultithreadSafety {

    // ���Ʋ����������
    private MultithreadSafety() {
    }

    // ͨ���÷������ʵ������
    public static MultithreadSafety getSingleton() {
        return Inner.singleton;
    }
    //上阿萨德
    private static class Inner {
        private static MultithreadSafety singleton = new MultithreadSafety();
    }
}
