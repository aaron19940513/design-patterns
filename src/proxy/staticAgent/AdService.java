package proxy.staticAgent;
/**
 * @author Sam Gao
 * @date 09/16/20 14:33
 */
public class AdService implements TvService {
    private TvService tvService;

    public AdService(TvService tvService) {
        this.tvService = tvService;
    }

    @Override
    public void watch(String program) {
        System.out.println("这里是一段15秒的广告");
        tvService.watch(program);
    }
}
