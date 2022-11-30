import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。

输入：nums = [2,7,11,15], target = 9
输出：[0,1]
解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。

输入：nums = [3,2,4], target = 6
输出：[1,2]
 */
public class Leetcode_1 {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        System.out.println(Arrays.toString(twoSum(nums,9)));
        System.out.println(Arrays.toString(twoSum_1(nums,9)));
    }
    //O(N²) for and for
    public static int[] twoSum(int[] nums,int target){
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1;j < nums.length;j++){
                if ((nums[i] + nums[j]) == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[0];
    }
    //O(N) for and hash
    public static int[] twoSum_1(int[] nums,int target){
        Map<Integer,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; ++i) {
            if (hashMap.containsKey(target-nums[i])){
                return new int[]{hashMap.get(target-nums[i]),i};
            }
            hashMap.put(nums[i],i);
        }
        return new int[0];
    }

}
