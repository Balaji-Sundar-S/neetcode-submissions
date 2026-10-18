class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i-1]) continue;
            int start = i + 1;
            int end = nums.length - 1;
            int thirdNum = nums[i];
            while (start < end) {
                int total = nums[start] + nums[end] + thirdNum;
                if (total == 0) {
                    res.add(Arrays.asList(nums[start], nums[end], thirdNum));
                    while (start < end && nums[start] == nums[start+1]) start++;
                    while (start < end && nums[end] == nums[end-1]) end--;
                    start++;
                    end--;
                } else if (total < 0) {
                    start++;
                } else {
                    end--;
                }
            }
        }
        return res;
    }
}
