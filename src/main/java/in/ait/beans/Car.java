package in.ait.beans;

//Target Class i.e Car
public class Car {
	// constructor
	public Car() {
		System.out.println("Car :: Constructor ");
	}

	// interface object eng created
	private IEngine eng;

	// Setter Injunction
	public void setEng(IEngine eng) {
		this.eng = eng;

		System.out.println(" \n setEng() method Called....");
		System.out.println(" -> Injected ::" + eng.getClass().getName());
	}

	// Drive Method
	public void drive() {
		boolean status = eng.start();
		if (status) {
			System.out.println("Journey Started ....\n ");
		} else {
			System.out.println("Engine fault ....");
		}
	}

}
