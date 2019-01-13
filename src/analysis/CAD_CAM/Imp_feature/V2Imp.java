package analysis.CAD_CAM.Imp_feature;

import CAD_CAM.oog.OOGFeature;
import CAD_CAM.oog.OOGSlotFeature;

public class V2Imp extends ImpFeature {
	
	private OOGFeature OOGFeature;

	@Override
	public void ImpSoltFeature() {
		OOGFeature   = new OOGSlotFeature();
		OOGFeature.OOGoperation();
	}

	@Override
	public void ImpCutOutFeature() {

	}

	@Override
	public void ImpSpecialFeature() {
		System.out.println("v2 special");

	}

	@Override
	public void ImpHoleFeature() {
		System.out.println("v2 hole");

	}

	@Override
	public void ImpIrregularFeature() {
		System.out.println("v2 irregular");

	}

}
