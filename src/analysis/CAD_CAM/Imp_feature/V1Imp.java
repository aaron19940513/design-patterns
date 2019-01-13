package analysis.CAD_CAM.Imp_feature;

import CAD_CAM.V1Facaed;

public class V1Imp extends ImpFeature {
	
	private V1Facaed v1Facaed;
	
	@Override
	public void ImpSoltFeature() {
		V1Facaed v1Facaed = V1Facaed.getInstance();
		v1Facaed.impFeature("solt","1");

	}

	@Override
	public void ImpCutOutFeature() {
		V1Facaed v1Facaed = V1Facaed.getInstance();
		System.out.println("v1 cutout");

	}

	@Override
	public void ImpSpecialFeature() {
		V1Facaed v1Facaed = V1Facaed.getInstance();
		System.out.println("v1 special");

	}

	@Override
	public void ImpHoleFeature() {
		V1Facaed v1Facaed = V1Facaed.getInstance();
		System.out.println("v1 hole");

	}

	@Override
	public void ImpIrregularFeature() {
		V1Facaed v1Facaed = V1Facaed.getInstance();
		System.out.println("v1 irregular");

	}

}
