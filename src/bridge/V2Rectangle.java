package bridge;

public class V2Rectangle extends Rectangle{

	public V2Rectangle(double x1, double y1, double x2, double y2) {
		super(x1, y1, x2, y2);
	}

	@Override
	public void darw() {
		drawLine(x1, y1, x2, y1);
		drawLine(x2, y1, x2, y2);
		drawLine(x2, y2, x1, y2);
		drawLine(x1, y2, x1, y1);
	}


	@Override
	protected void drawLine(double x1, double y1, double x2, double y2) {
		DP2 dp2= new DP2();
		dp2.drawLine(x1, y1, x2, y1);
	}
	


}
