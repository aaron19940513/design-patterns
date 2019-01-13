package analysis.CAD_CAM.feature;

import CAD_CAM.Imp_feature.ImpFeature;

public class SpecailFeature extends Feature{

	public SpecailFeature(ImpFeature impFeature) {
		super(impFeature);
	}

	@Override
	public void operation() {
		impFeature.ImpSpecialFeature();
	}

}
