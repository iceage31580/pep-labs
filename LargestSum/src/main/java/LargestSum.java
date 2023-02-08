
import java.util.List;

public class LargestSum {
    /**
     * Get the largest possible sum that can be obtained from a pair of values in the list. A number can't be added
     * to itself, unless there are duplicates.
     *
     * @param nums a list of ints.
     * @return the largest possible sum of separate numbers from nums.
     */
    public int bigSum(List<Integer> nums){
        int maxSum = 0; 
        int maxNum = Integer.MIN_VALUE; 

        for(Integer num: nums)
        {
            if(num > maxNum)
            {
                maxNum = num; 
            }
        }

        for(Integer num: nums)
        {
            if(num != maxNum || nums.stream().filter(n-> n == num).count() >= 2)
            {
                maxSum = Math.max(maxSum, maxNum + num); 
            }
            
        }
        return maxSum;
    }
}