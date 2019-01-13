package analysis.bridge;

public class V1Rectangle extends Rectangle{

	public V1Rectangle(double x1, double y1, double x2, double y2) {
		super(x1, y1, x2, y2);
	}

	@Override
	public void darw() {
		super.draw();
	}


	@Override
	protected void drawLine(double x1, double y1, double x2, double y2) {
		DP1 dp1= new DP1();
		dp1.draw_a_line(x1, y1, x2, y1);
		
	}
	


}
