class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int currentNumber = nums[i];
            int numberNeeded = target - currentNumber;
            if (map.containsKey(numberNeeded)) {
                return new int[] {map.get(numberNeeded), i};
            }
            map.put(currentNumber, i);
        }
        return new int[] {};
    }
}
