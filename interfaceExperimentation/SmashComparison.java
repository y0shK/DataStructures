package interfaceExperimentation;

public interface SmashComparison {
	
	// implementation which can be added to SBMeleeCharacter.java
	// this implementation provides guidance/a framework for the subclass to use
	// we could just create these method in the subclass,
		// but implementing them adds uniformity (it's a design choice)

	// for every subclass of smashbroscharacter,
	// we want to measure a particular value
	// instead of defining the method distinctly in every class, just do it here
		// and implement the method
		// this adds uniformity
	public boolean isFloatierThan(SmashComparison otherCharacter);
	
}
