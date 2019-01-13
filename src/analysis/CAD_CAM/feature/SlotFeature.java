package analysis.CAD_CAM.feature;

import CAD_CAM.Imp_feature.ImpFeature;

public class SlotFeature extends Feature{

	public SlotFeature(ImpFeature impFeature) {
		super(impFeature);
	}

	@Override
	public void operation() {
		impFeature.ImpSoltFeature();
	}

}
