package csce247project2;

import java.util.ArrayList;

public class Baby implements Subject {
	
	private ArrayList<Observer> observers;
	private Cry cry;
	
	// Baby constructor
	public Baby() {
		observers = new ArrayList<Observer>();
		System.out.println("A baby is born");
	}
	
	// Adds observer to Baby observers arraylist
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}
	
	// Removes observer to Baby observers arraylist
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}
	
	// Updates all observers of the Baby's cry change
	public void notifyObservers() {
		int observersSize = observers.size();
		for (int i = 0; i < observersSize; i++) {
			observers.get(i).update(this.cry);
		}
	}
	
	// Sets Baby cry to ANGRY
	public void angryCry() {
		cry = Cry.ANGRY;
		System.out.println("This baby is angry!");
		notifyObservers();
	}
	
	// Sets Baby cry to HUNGRY
	public void hungryCry() {
		cry = Cry.HUNGRY;
		System.out.println("This baby is hungry");
		notifyObservers();
	}
	
	// Sets Baby cry to WET
	public void wetCry() {
		cry = Cry.WET;
		System.out.println("This baby is wet");
		notifyObservers();
	}
}
