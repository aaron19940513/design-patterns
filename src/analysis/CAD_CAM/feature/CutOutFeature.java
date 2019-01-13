package analysis.CAD_CAM.feature;

import CAD_CAM.Imp_feature.ImpFeature;

public class CutOutFeature extends Feature{

	public CutOutFeature(ImpFeature impFeature) {
		super(impFeature);
	}

	@Override
	public void operation() {
		impFeature.ImpCutOutFeature();
	}

}
