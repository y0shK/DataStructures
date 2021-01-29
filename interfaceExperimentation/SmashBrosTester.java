package interfaceExperimentation;

public class SmashBrosTester {

	public static void main(String[] args) {
		
		SmashBrosMeleeCharacter marth = new SmashBrosMeleeCharacter("Marth", "Fire Emblem", 3, 5);
		SmashBrosMeleeCharacter falco = new SmashBrosMeleeCharacter("Falco", "Star Fox", 2, 2);
		
		System.out.println(marth.isFloatierThan(falco));
		System.out.println(falco.isFloatierThan(marth));
		
	}

}
