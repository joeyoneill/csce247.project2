package csce247project2;

public class Dad implements Observer {

	private Subject baby;
	
	// Dad constructor
	public Dad(Subject baby) {
		this.baby = baby;
	}
	
	// Allows reaction of Dad based on cry
	public void update(Cry cry) {
		if (cry == Cry.ANGRY) {
			System.out.println("Dad puts in earplugs");
		}
		else if (cry == Cry.HUNGRY) {
			System.out.println("Dad feeds baby");
		}
		else {
			System.out.println("Dad calls mom");
		}
	}
	
}
