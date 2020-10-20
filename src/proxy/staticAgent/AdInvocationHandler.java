package proxy.staticAgent;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author Sam Gao
 * @date 09/17/20 11:13
 */
public class AdInvocationHandler implements InvocationHandler {
    private TvService tvService;

    public AdInvocationHandler(TvService tvService) {
        this.tvService = tvService;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("这里是一段15秒的广告");
        return method.invoke(tvService, args);
    }
}
