package Day4.Wiley_core_java.src.string_classes;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer chatHistory = new StringBuffer();
		
		String sender = "Praveen";
		String message = "Hi da";
		chatHistory.append(sender).append(": ").append(message).append("\n");
		
		sender = "Anonymous";
		message = "Hey there";
		chatHistory.append(sender).append(": ").append(message).append("\n");
		
		System.out.println(chatHistory);
	}

}
