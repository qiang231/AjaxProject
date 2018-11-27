public class PrintPhoto {
    public static void main(String[] args) {


        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= 2 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= 2 * i; j++) {
                if(j <= i){
                    System.out.printf("%4d", 2 * j );
                }
//                System.out.print("*");
            }
            System.out.println();
        }
    }
}

