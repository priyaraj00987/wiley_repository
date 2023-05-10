package Day_3.Wiley_core_java.src.Exceptions;

public class FinallyBlock {

	public static void main(String[] args) {
		try {
			System.out.println('1');
			System.out.println("Wiley");
			try { //nested try-catch is possible
				System.out.println(10/0);
			} catch (Exception ee) {
				System.out.println("Inside nested try-catch");
				ee.printStackTrace();
			}
			System.out.println(10/0);
			System.out.println("fourth print statement");
		} catch (Exception e){
			e.printStackTrace();
			//System.out.println(5/0);
		} finally {
			System.out.println("Close connection");
			System.exit(0);
		}
	}

}
