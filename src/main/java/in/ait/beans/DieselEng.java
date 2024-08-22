package in.ait.beans;

public class DieselEng implements IEngine {
	// Dependency no - 1 Diesel Engine
	public DieselEng() {
		System.out.println("Diesel Engine :: Constructor..");
	}

	@Override
	public boolean start() {
		System.out.println("Diesel Eng Started ....");
		return true;
	}

}
