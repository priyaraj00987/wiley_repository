import java.util.*;

public class DoWhile {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int num;

        do{
            num = sc.nextInt();
        } while(num<1 || num>10);

        System.out.println("The last number you entered is: " + num);
    }
}
