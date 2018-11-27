import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args){

        final int N = 50000;
        int[] nums = new int[N];


        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int)(Math.random() * 100000);
        }
        long startTime = System.currentTimeMillis();
        Arrays.sort(nums);





//        int temp;
//
//        for (int i = 0; i < nums.length; i++) {
//            int min = nums[i];
//            int minIndex = i;
//            for (int j = i + 1; j < nums.length; j++) {
//                if (min > nums[j]) {
//                    min = nums[j];
//                    minIndex = j;
//
//                }
//            }
//            temp = nums[i];
//            nums[i] = nums[minIndex];
//            nums[minIndex] = temp;
//        }
        

//        for (int i = 0; i < nums.length - 1; i++) {
//            for (int j = 0; j < nums.length - i - 1 ; j++) {
//                if (nums[j] > nums[j+1]) {
//                    int temp = nums[j];
//                    nums[j] = nums[j+1];
//                    nums[j+1] =temp;
//
//                }
//            }
//        }
        long endTime = System.currentTimeMillis();
        System.out.println("排序共使用了" + (endTime - startTime) + "毫秒");
//        System.out.println("排序后；");
//        for (int i = 0; i < nums.length ; i++) {
//            System.out.print(nums[i]);
//            if ((i+1) % 20 == 0){
//                System.out.println();
//            }else {
//                System.out.print(",");
//            }
//
//
//
//        }
//        System.out.println();
//


    }
}
