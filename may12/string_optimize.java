package may12;

public class string_optimize {
    public static void main(String[] args) {
        long start= System.currentTimeMillis();
        String result =" ";
        for(int i=0;i<10000;i++){
            result+=i;

        }
        long end=System.currentTimeMillis();
        System.out.println("time taken"+(end-start));
        start =System.currentTimeMillis();
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<10000;i++){
            sb.append(i);
        }
        end= System.currentTimeMillis();
        System.out.println( "time taken"+(end-start));
    }
}
