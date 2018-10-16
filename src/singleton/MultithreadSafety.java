package singleton;

public class MultithreadSafety {

    // 限制产生多个对象
    private MultithreadSafety() {
    }

    // 通过该方法获得实例对象
    public static MultithreadSafety getSingleton() {
        return Inner.singleton;
    }

    private static class Inner {
        private static MultithreadSafety singleton = new MultithreadSafety();
    }
}
