enum WeekDays{
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY
}


public class EnumExample {
    public static void main(String[] args) {
        for(WeekDays days: WeekDays.values()){
            System.out.println(days);
        }    
    }
    
}
