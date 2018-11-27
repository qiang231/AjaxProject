public class SelectSort {
    public static void main(String[] args){
        final int N =100;
        int[] nums = new int[N];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int)(Math.random() * 1000);
        }

        int temp;
        for (int i = 0; i < nums.length; i++) {
            int min = nums[i];
            int minIndex = i;
            for (int j = i + 1 ; j < nums.length; j++) {
                if (min > nums[j]) {
                    min = nums[j];
                    minIndex = j;
                }
            }
            temp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = temp;

        }

        System.out.println("排序后；");
        for (int i = 0; i < nums.length ; i++) {
            System.out.print(nums[i]);
            if ((i+1) % 20 == 0){
                System.out.println();
            }else {
                System.out.print(",");
            }



        }
        System.out.println();


    }
}
