package Zen.singleton;

/**
 * ���������� Java������������Ż��������ڹ��췽��ʵ����֮ǰ�ӹ��췽������ָ��ö�������� �������DoubleCheckLock����������ȫ����֮ǰ��doSync�Ϳ�������ˡ���ش������⣬���ң��Ż� ��������ע�⵽ʵ����Աû�а취������if���֮��ı�״̬�����л��Ż����ڶ�����
 * 
 * @author �߽���
 * @date Oct 16, 2018 10:16:40 AM
 * @version 1.0
 */
public class DoubleCheckLock {
    private static DoubleCheckLock singleton = null;

    // ���Ʋ����������
    //sa d
    private DoubleCheckLock() {
    }

    // ͨ���÷������ʵ������
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
