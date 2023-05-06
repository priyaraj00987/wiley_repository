package string_classes;

public class StringBuilderClass {
	public static void main(String[] args) {
//		StringBuilder sb = new StringBuilder("Wiley");
//		sb.append(" Edge");
		
		//[timstamp user: userID, message: logged in successfully]
		int userId = 123456;
		String user = "Praveen";
		String message = "Logged";
		StringBuilder log = new StringBuilder();
		long timestamp = System.currentTimeMillis();
		log.append("[")
			.append(timestamp)
			.append("]")
			.append(user)
			.append(": ")
			.append(userId)
			.append(", message: ")
			.append(message);
		System.out.println(log);
	}
}
