package in.ait.beans;

//Dependency no 3 
public class EvEng implements IEngine {
	public EvEng() {
		System.out.println("EV::Constructor ");
	}

	@Override
	public boolean start() {
System.out.println("Electric Car Starts ....");
		return true;
	}

}
