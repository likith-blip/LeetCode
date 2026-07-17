import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class TwoSum { // Changed class name to match TwoSum.java
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            } else {
                map.put(nums[i], i);
            }
        }
        throw new IllegalArgumentException("no match");
    }


    public static void main(String[] args) {
        TwoSum solver = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        
        int[] result = solver.twoSum(nums, target);
        System.out.println(Arrays.toString(result)); // Expected output: [0, 1]
    }
}