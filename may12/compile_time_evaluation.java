package may12;

public class compile_time_evaluation {
    //compile time evaluation
    public static final int Max_size=100;
    public static  final int sum= 10+20;

    public static void main(String[] args) {
        int[] array =new int [Max_size];
        System.out.println(sum);//known as compile time
    }
}
