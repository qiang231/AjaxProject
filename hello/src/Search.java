import java.util.Scanner;

public class Search {
    public static void main(String[] args){

        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++){
            nums[i] = ((int)(Math.random() * 10000)) % 1001;
        }
        for (int i=0; i<nums.length; i ++ ){
            System.out.printf("%4d",nums[i]);
        }
        System.out.println();

        System.out.println("请输入要查找的数字：");
        int searchNmum = new Scanner(System.in).nextInt();
        int searchIndex = -1;
        for (int i = 0; i <nums.length; i++){
//        for (int i : nums){
            if (searchNmum == nums[i] ){
                searchIndex = i;
                break;
            }
        }
        if (searchIndex != -1){
            System.out.println("找到了，在数组的第" + (searchIndex + 1) + "个位置");
        }
        else {
            System.out.println("很遗憾，没有找到这个数字");
        }


    }
}
