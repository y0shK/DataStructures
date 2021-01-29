package interfaceExperimentation;

public class SmashBrosCharacter {
	
	// member variables of the superclass
	// these variables are inherited by the subclass
	String name;
	String series;
	int tierListPlacement;
	
	// standard - make a constructor and initialize the values
	public SmashBrosCharacter() {
		// default values
		this.name = "";
		this.series = "";
		this.tierListPlacement = 0;
	}
	
	public SmashBrosCharacter(String name, String series, int tierListPlacement) {
		this.name = name;
		this.series = series;
		this.tierListPlacement = tierListPlacement;
	}

}
