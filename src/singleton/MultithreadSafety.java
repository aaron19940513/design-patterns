package singleton;

public class MultithreadSafety {


    private MultithreadSafety() {
    }

    public static MultithreadSafety getSingleton() {
        return Inner.singleton;
    }

    private static class Inner {
        private static MultithreadSafety singleton = new MultithreadSafety();
    }
}