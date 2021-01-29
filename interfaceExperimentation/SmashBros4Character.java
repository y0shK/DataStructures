package interfaceExperimentation;

public class SmashBros4Character extends SmashBrosCharacter implements SmashComparison {

	int rageSpeed;
	
	public SmashBros4Character(String name, String series, int tierListPlacement, int rageSpeed) {
		super(name, series, tierListPlacement);
		this.rageSpeed = rageSpeed;
	}
	
	// define the method that is passed via the interface
	// this takes the "guideline" of the interface into account
	public boolean isFloatierThan(SmashComparison otherCharacter) {
		if (this.name.toLowerCase().equals("jigglypuff") || this.name.toLowerCase().equals("peach")) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
