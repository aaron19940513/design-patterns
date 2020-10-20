package proxy.staticAgent;
/**
 * @author Sam Gao
 * @date 09/16/20 14:25
 */
public class TvServiceImpl implements TvService {
    @Override
    public void watch(String program) {
        System.out.println("watch " + program);
    }
}
