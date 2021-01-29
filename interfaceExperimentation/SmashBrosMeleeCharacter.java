package interfaceExperimentation;

// public class
// extends SmashBrosCharacter - simple inheritance, SBMelee is the subclass of superclass SB
// implements SmashComparison - takes the guidance of interface to declare new, specific methods
public class SmashBrosMeleeCharacter extends SmashBrosCharacter implements SmashComparison {

	// simple inheritance
	int wavedashLength;
	
	public SmashBrosMeleeCharacter(String name, String series, int tierListPlacement, int wavedashLength) {
		super(name, series, tierListPlacement);
		this.wavedashLength = wavedashLength;
	}
	
	public boolean isFloatierThan(SmashComparison otherCharacter) {
		// why are Marth and Jigglypuff so floaty?
		if (this.name.toLowerCase().equals("marth") || this.name.toLowerCase().equals("jigglypuff")) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
