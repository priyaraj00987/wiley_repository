package IOStreams;

import java.io.Console;

public class ConsoleClass {
	public static void main(String[] args) {
		Console console = System.console();
		if(console==null) {
			System.out.println("Console is not available");
			System.exit(1);
		} 
		
		String name = console.readLine("Enter name: ");
		char[] password = console.readPassword("Enter password: ");
		
		console.printf("Hello "+name);
		console.printf("Password: %s"+new String(password));
	}
}
