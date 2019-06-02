package analysis.CAD_CAM.feature;


import analysis.CAD_CAM.Imp_feature.ImpFeature;
public class IrregularFeature extends Feature{

	public IrregularFeature(ImpFeature impFeature) {
		super(impFeature);
	}

	@Override
	public void operation() {
		impFeature.ImpCutOutFeature();
	}

}
