package csce247project2;

/* Joseph O'Neill
 * CSCE 247 Section 002
 * 1/27/2020
 */

public class CribDriver {
	
	public void playBabySim() {
		Baby baby = new Baby();
		Dad dad = new Dad(baby);
		Mom mom = new Mom(baby);
		
		baby.registerObserver(dad);
		baby.registerObserver(mom);
		
		// println's to match output file format
		System.out.println();
		baby.hungryCry();
		System.out.println();
		baby.wetCry();
		System.out.println();
		
		baby.removeObserver(mom);
		baby.angryCry();
		System.out.println();
		
		baby.removeObserver(dad);
		baby.registerObserver(mom);
		baby.hungryCry();
		System.out.println();
		baby.wetCry();
	}
	
	public static void main(String[] args) {
		CribDriver cd = new CribDriver();
		cd.playBabySim();
	}

}
