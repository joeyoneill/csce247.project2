package csce247project2;

public class Mom implements Observer {
	
	private Subject baby;
	
	// Mom constructor
	public Mom(Subject baby) {
		this.baby = baby;
	}
	
	// Allows reaction of Mom based on cry
	public void update(Cry cry) {
		if (cry == Cry.ANGRY) {
			System.out.println("Mom hugs and rocks baby, maybe spoiling");
		}
		else if (cry == Cry.HUNGRY) {
			System.out.println("Mom cuddles and feeds baby");
		}
		else {
			System.out.println("Mom changes baby");
		}
	}
	
}
