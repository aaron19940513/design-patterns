package analysis.observer;

import java.util.Vector;

public class Customer {
	protected static Vector<Observer> observers;

	public static void attach(Observer observer) {
		observers.add(observer);
	}

	public static void detach(Observer observer) {
		observers.remove(observer);
	}

	public void notifyObs() {
		for (Observer observer : observers) {
			observer.update(this);
		}
	}

}
