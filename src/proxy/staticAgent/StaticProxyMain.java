package proxy.staticAgent;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import sun.misc.ProxyGenerator;

/**
 * @author Sam Gao
 * @date 09/16/20 14:26
 */
public class StaticProxyMain {
    public static void main(String[] args) {
        TvService tvService = new TvServiceImpl();
        InvocationHandler invocationHandler = new AdInvocationHandler(tvService);
        TvService proxy = (TvService) Proxy.newProxyInstance(TvService.class.getClassLoader(), TvServiceImpl.class.getInterfaces(), invocationHandler);
        proxy.watch("喜洋洋");

        String path = "D:/$Proxy0.class";
        byte[] classFile = ProxyGenerator.generateProxyClass("$Proxy0", TvServiceImpl.class.getInterfaces());
        FileOutputStream out = null;

        try {
            out = new FileOutputStream(path);
            out.write(classFile);
            out.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
