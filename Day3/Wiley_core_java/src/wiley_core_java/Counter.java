package wiley_core_java;

public class Counter {
	
	private static int count =0;
	private final String names;
	
	public Counter(String name) {
		this.names = name;
	}
	
	public synchronized void increment() {
		count++;
	}
	
	public int getCount() {
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
