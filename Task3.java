
import java.util.Scanner;

public class main{

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.print("Input array length: ");
        int length = in.nextInt();

        int[] nums = new int[length];

        System.out.print("Input array elements");
        for (int i = 0; i < length; i++){
            nums[i] = in.nextInt();
        }
        
        in.close();
        
        System.out.print(findMax(nums));
    }

    static int findMax(int[] nums) {
        int max = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];

            }
        }
        return max;
    }
}