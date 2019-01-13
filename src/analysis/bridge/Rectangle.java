package analysis.bridge;

public abstract class Rectangle extends Shape {
	protected double x1, y1, x2, y2;

	public Rectangle(double x1, double y1, double x2, double y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}

	public void draw() {
		drawLine(x1, y1, x2, y1);
		drawLine(x2, y1, x2, y2);
		drawLine(x2, y2, x1, y2);
		drawLine(x1, y2, x1, y1);
	}
	
	protected abstract void drawLine(double x1, double y1, double x2, double y2);
}
