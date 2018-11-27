import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * Java核心技术课本上的打印日历
 */
public class CalendarTest {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);
//        System.out.println(LocalDate.now());

        int month = date.getMonthValue();
        int today = date.getDayOfMonth();

        //将date设置为当月的第一天，并得到这一天是星期几
        date = date.minusDays(today - 1);
        DayOfWeek weekday = date.getDayOfWeek();        //这个函数可以判断这天是星期几

        //获取当月1号是星期几，1 = 星期一，7 = 星期日
        int value = weekday.getValue();

        //打印月历开始的空格
        System.out.println("Mon Tue  Wed  Thu  Fri  Sat  Sun");
        for (int i = 0; i < value; i++) {
            System.out.print("  ");
        }

        //打印日历主体，如果是当天则加一个*号

        while (date.getMonthValue() == month){
            System.out.printf("%3d",date.getDayOfMonth());
            if (date.getDayOfMonth() == today) {
                System.out.print("*");
            }else
                System.out.print(" ");
            date = date.plusDays(1);            //生成当前日期之后一天的日期
            if (date.getDayOfWeek().getValue() == 1)
                System.out.println();

        }

        if(date.getDayOfWeek().getValue() != 1)
            System.out.println();



    }



}

