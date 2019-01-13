package analysis.bridge.another;

public class Client {
	static public void main() {
		Shape myShapes[];
		Factory myFactory = new Factory();
		// get rectangles from some other source
		myShapes = myFactory.getShapes();
		for (int i = 0; i < myShapes.length; i++) {
			myShapes[i].draw();
		}
	}
}
