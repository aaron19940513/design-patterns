package analysis.CAD_CAM;

public class V1Facaed {
	/**
	 * 头引用变量
	 */
	public static V1Facaed facaed = null;

	public static V1Facaed getInstance() {
		synchronized (V1Facaed.class) {
			if (facaed == null) {
				return new V1Facaed();
			}
			return facaed;
		}
	}

	public void impFeature(String featureType, String id) {
		V1Modules v1Modules = new V1Modules();
		v1Modules.step1();
		v1Modules.step2();
		v1Modules.step3();
		
	}
	
	
}
