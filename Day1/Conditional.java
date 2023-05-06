import java.util.*;


public class Conditional {
    public float calculateCartValue(float arr[]){
        float cartValue=0;
        for(float i: arr){
            cartValue+=i;
        }
        return cartValue;
    }

    public float calculateDiscount(float cartValue){
        float finalAmount=cartValue;
        finalAmount = cartValue >= 10000.00 ? cartValue/10 : finalAmount;
        System.out.println(finalAmount);
        return finalAmount;
    }
    public static void main(String args[]) {
        Conditional con = new Conditional();
        Scanner sc = new Scanner(System.in);
        float arr[] = new float[100];
        System.out.print("Enter the number of items: ");
        int n = sc.nextInt();
        System.out.println("Enter the amount of the items: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextFloat();
        }
        float cartValue = con.calculateCartValue(arr);
        if(cartValue>=10000) {
            System.out.println("You are eligible for a 10% discount!!!");
        }
        System.out.println("The final amount = " + con.calculateDiscount(cartValue));
        sc.close();
    }
}
