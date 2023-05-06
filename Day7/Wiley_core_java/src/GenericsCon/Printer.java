package GenericsCon;

public class Printer<T extends Animal> {
	T valToPrint;
	
	public Printer(T valToPrint) {
		this.valToPrint = valToPrint;
	}
	
	public void print() {
		System.out.println(valToPrint);
	}
}
