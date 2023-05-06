public class Casting {
    public static void main(String[] args) {
        int intVariable = 9;
		double doubleVariable = intVariable; 
	
		System.out.println(intVariable);      
		System.out.println(doubleVariable); 

        int intVariable2 = (int)doubleVariable;
        System.out.println(intVariable2);

        byte byteVariable = 102;
        char charVariable = (char)byteVariable;
        System.out.println(charVariable);

        String intString = "9";
        int a = Integer.parseInt(intString);
        System.out.println(a);
    }
}
