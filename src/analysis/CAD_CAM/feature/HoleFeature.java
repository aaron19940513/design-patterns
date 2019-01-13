package analysis.CAD_CAM.feature;

import CAD_CAM.Imp_feature.ImpFeature;

public class HoleFeature extends Feature{

	public HoleFeature(ImpFeature impFeature) {
		super(impFeature);
	}

	@Override
	public void operation() {
		impFeature.ImpHoleFeature();
	}

}
