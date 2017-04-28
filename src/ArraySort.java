import java.util.Arrays;

/**
 * Created by William Yu on 4/24/2017.
 */
public class ArraySort {
    public static int[] sort(int[] nums) {
        int[] sortedList = null;
        int currentSmall = 0;
        int placeHolder;
        int j;
        int minIndex=0;
        for (int i = 0; i < nums.length - 1; i++) {
            currentSmall = nums[i];
            minIndex = i;
            for (j = i + 1; j < nums.length; j++) {
                if (currentSmall > nums[j]) {
                    currentSmall = nums[j];
                    minIndex=j;

                }
            }

            placeHolder = nums[i];
            nums[i] = currentSmall;
            nums[minIndex] = placeHolder;

        }
        return nums;
    }


    public static void main(String[] args) {
        int[] array = new int[]{1, 5, 87, 21, 13, 41, 1, 14, 24};
        ArraySort.sort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void swap() {

    }
}
