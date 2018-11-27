public class StringBufferDemo {
    public static void main(String[] args) {
        final int N = 500000;
        long startTime = System.currentTimeMillis();

        String str = "*";
        for (int i = 0; i < N; i++) {
            str += "*";

        }
        long endTime = System.currentTimeMillis();

        System.out.println("用时：" + (endTime - startTime));


        startTime = System.currentTimeMillis();


        StringBuffer str1 = new StringBuffer("*");
        for (int i = 0; i < N; i++) {
            str1.append("*") ;

        }
        endTime = System.currentTimeMillis();

        System.out.println("用时：" + (endTime - startTime));




        startTime = System.currentTimeMillis();

        StringBuilder str2 = new StringBuilder("*");
        for (int i = 0; i < N; i++) {
            str2.append("*") ;

        }
        endTime = System.currentTimeMillis();

        System.out.println("用时：" + (endTime - startTime));
    }
}
