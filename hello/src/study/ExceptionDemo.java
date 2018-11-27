package study;

public  class ExceptionDemo {

    public static int division(int num1, int num2){
        int result = Integer.MIN_VALUE;
        try{
             result = num1 / num2;
        }catch (Exception e){
            System.err.println(e.getMessage());
        }

        return result;
    }

    public static void main(String[] args) {
        int result =  division(5 , 0);
        System.out.println("result = " + result);
    }
}
