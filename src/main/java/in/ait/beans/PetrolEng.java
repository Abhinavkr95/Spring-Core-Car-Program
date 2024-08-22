package in.ait.beans;

// Dependency no - 2 Petrol Engine 

public class PetrolEng implements IEngine {

	public PetrolEng() {
		System.out.println("Petrol Engine :: Constructor ");
	}

	@Override
	public boolean start() {
		System.out.println("Petrol Engine Started ....");
		return true;
	}

}
