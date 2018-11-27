import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int[] nums = {3, 4, 5, 12, 35, 47, 65, 74, 94, 244, 544};
        int low = 0;
        int high = nums.length - 1;
        System.out.println("请输入要查找的数字：");
        int searchNum = in.nextInt();
        int deleteIndex = -1;
        boolean isFind = false;        //是否找到
        while (low <= high) {
            //计算中点下标
            int mid = (high + low) / 2;

            if (searchNum < nums[mid]) {
                high = mid - 1;
            } else if (searchNum > nums[mid]) {
                low = mid + 1;
            } else {
                System.out.println("找到了数字，下标为：" + mid );
                deleteIndex =mid;
                break;
            }

        }
        if (!isFind) {
            System.out.println("没找到");
        }else {

            for (int i = deleteIndex; i < nums.length; i++) {
                nums[i] = nums[i + 1];

            }

        }

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);

        }
    }
}
