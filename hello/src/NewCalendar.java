import java.util.Scanner;

/**
 * 使用方法打印日历
 */
public class NewCalendar {

    public static int year = Integer.MIN_VALUE;
    public static int month = Integer.MIN_VALUE;
    private static int [] dayOfMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
    public static void main(String[] args) {
        PrintCalendar();
    }

    /**
     * 打印月历的核心方法
     */
    public static void PrintCalendar() {
        //1.输入年份和月份
        InputYearAndMonth();


        //2.计算1900-1-1 到用户输入年份月份1号的总天数
            //2-1.计算各年的天数
       int sum = GetSumDayOfYears();
            //2-2.计算各月的天数之和
        sum += getSumDayOfMonth();
        sum ++;                    // 到了当月第一天
        System.out.println(sum %7 );
        //3.打印年份和月份(英文)
        printMonthTitle();
        //4.打印月份的标题(星期一到星期日)
        //5.根据某月1日是星期几打印月历
        printCalendar(sum % 7);
    }

    /**
     *
     * @param dayOfWeek  //根据当月1号是星期几打印月历
     */
    private static void printCalendar(int dayOfWeek){
        int sepCount = 0;
        if (dayOfWeek == 0){
            sepCount = 6;
        }else {
            sepCount = dayOfWeek -1;
        }
        for (int i = 0; i < sepCount; i++) {
            System.out.print("\t");
        }
        for (int i = 0; i < dayOfMonth[month -1]; i++) {

            System.out.print(i+1);
            if ((dayOfWeek + i) % 7 ==0){
                System.out.println();
            }else {
                System.out.print("\t");
            }
        }

    }

    private static void printMonthTitle(){
        String[] monthName = {"January","February","March","April","May","June","July",
        "August","Septemper ", "October","November","December"};
        System.out.println("\t\t\t\t" + year + "\t" + monthName[month -1]);
        String[] weekdays = {"月曜日","火曜日","水曜日","木曜日","金曜日","土曜日","日曜日"};
        for (int i = 0; i < weekdays.length; i++) {
            System.out.print(weekdays[i] + "   ");
        }
        System.out.println();

    }


    /**
     * 获得1900到year年的总天数
     */
    private static int GetSumDayOfYears() {
        int sum = 0;
        if (year == Integer.MIN_VALUE) {
            System.out.println("年份错误，请重新输入");
            InputYearAndMonth();
        }

        for (int i = 1900; i < year; i++) {
            sum += 365;
            if(isLeapYear(i)){
                sum++;
            }
        }
        return sum;
    }

    /**
     *
     * @param year      //用来判断输入的年份是否是闰年
     * @return
     */
    private static boolean isLeapYear(int year){
        return year % 400 == 0 || year % 4 == 0 && year % 100 != 0;
    }

    /**
     *
     * @return    计算year年一月一号到该月1号的天数
     */
    private static int getSumDayOfMonth(){

        int sum = 0;
        if (month == Integer.MIN_VALUE) {
            System.out.println("月份错误，请重新输入");
            InputYearAndMonth();
        }
        for (int i = 0; i < month - 1; i++) {
            sum += dayOfMonth[i];
        }
        //如果year年是闰年并且year大于3，所以2月份要多加一天
        if(isLeapYear(year) && month >= 3)
            sum++;
        return  sum;
    }



    /**
     * 输入年份和月份
     */
    private static void InputYearAndMonth() {
        Scanner in = new Scanner(System.in);
        System.out.print("请输入年份：");
        year = in.nextInt();
        System.out.print("请输入月份: ");
        month = in.nextInt();
        in.close();
        in = null;

    }


}
