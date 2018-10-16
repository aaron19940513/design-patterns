package singleton;

/**
 * 功能描述： Java编译器本身的优化工作会在构造方法实例化之前从构造方法返回指向该对象的引用 ，因此在DoubleCheckLock对象真正完全构造之前，doSync就可能完成了。这回带来问题，而且，优化 编译器回注意到实例成员没有办法在两个if语句之间改变状态，所有会优化掉第二个。
 * 
 * @author 高健超
 * @date Oct 16, 2018 10:16:40 AM
 * @version 1.0
 */
public class DoubleCheckLock {
    private static DoubleCheckLock singleton = null;

    // 限制产生多个对象
    private DoubleCheckLock() {
    }

    // 通过该方法获得实例对象
    public static DoubleCheckLock getSingleton() {
        if (singleton == null) {
            doSync();
        }
        return singleton;
    }

    private synchronized static void doSync() {
        if (singleton == null) {
            singleton = new DoubleCheckLock();
        }
    }
}
