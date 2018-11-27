/**
 * 求数组的最大值最小值
 */

public class MaxMinArray {
    public static void main(String[] args){

        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++){
            nums[i] = ((int)(Math.random() * 10000)) % 1001;
        }
        for (int i=0; i<nums.length; i ++ ){
            System.out.printf("%4d",nums[i]);
        }
        int max = nums[0];
        for (int i =0 ; i<nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }
        System.out.println();
        System.out.print("最大值是：" + max);

        int min = nums[0];
        for (int i =0 ; i<nums.length; i++){
            if(nums[i] < min){
                min = nums[i];
            }
        }
        System.out.println();
        System.out.print("最小值是：" + min);
    }
}
