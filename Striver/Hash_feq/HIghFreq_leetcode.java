//remaining dry run

package Hash_feq;
import java.util.*;
public class HIghFreq_leetcode {
    
    public static int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums); // Step 1: sort
        long sum = 0;      // will store sum of window
        int left = 0;      // window start
        int result = 1;    // answer

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right]; // add new number into window

            // Step 3: check if cost > k
            while ((long) nums[right] * (right - left + 1) - sum > k) {
                sum -= nums[left]; // remove left number
                left++;            // shrink window
            }

            // Step 4: update answer
            result = Math.max(result, right - left + 1);
        }
        return result;
    }
    public static void main(String[] args) {
        int nums[]={1,2,4};
        int k=5;
        int x=maxFrequency(nums,k);
        System.out.println(x);
    }
}


