class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        int res = 0;
        for (int num : nums) {
            set.add(num);
        }
        for (int num : set) {
            int previousValue = num - 1;
            if (!set.contains(previousValue)) {
                int currentCount = 1;
                int nextValue = num + 1;
                while (set.contains(nextValue)) {
                    currentCount += 1;
                    nextValue += 1;
                }
                res = Math.max(currentCount, res);
            }
        }
        return res;
    }
}
