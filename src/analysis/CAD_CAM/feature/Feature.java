package analysis.CAD_CAM.feature;


import analysis.CAD_CAM.Imp_feature.ImpFeature;

public abstract class Feature {
	protected ImpFeature impFeature;
	
	public Feature(ImpFeature impFeature) {
		this.impFeature = impFeature;
	}
	
	public abstract void operation();

}
