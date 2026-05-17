class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i<nums.length; i++) {
            int firstNumber = nums[i];
            int secondNumber = target - nums[i];
            for (int j : map.keySet()) {
                if (j == secondNumber) {
                    return new int[]{map.get(j), i};
                }
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
