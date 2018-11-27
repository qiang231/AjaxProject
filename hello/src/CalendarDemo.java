import java.util.Calendar;

public class CalendarDemo {
    public static void main(String[] args) {
        //calendar类是个抽象类，一般调用子类GregorianCalendar去实现
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getClass());


        int year        = calendar.get(Calendar.YEAR);
        int month       = calendar.get(Calendar.MONTH) + 1;
        int day         = calendar.get(Calendar.DATE);
        int hour        = calendar.get(Calendar.HOUR_OF_DAY);
        int minute      = calendar.get(Calendar.MINUTE);
        int second      = calendar.get(Calendar.SECOND);
        int millSecond  = calendar.get(Calendar.MILLISECOND);
        System.out.println("当前时间：");
        String strTime = String.format("%d-%02d-%02d  %02d/%02d/%02d:%s",
                year,month,day,hour,minute,second,millSecond);
        System.out.println(strTime);


    }
}
