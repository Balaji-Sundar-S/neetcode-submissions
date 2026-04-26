class Solution {
    public int longestConsecutive(int[] nums) {
        
        int longestSequence = 0;
        HashMap<Integer, Boolean> exploredValue = new HashMap<>();

        for (int num : nums) {
            exploredValue.put(num, false);
        }

        for (int i=0; i<nums.length; i++) {
            
            int currentLongest = 0;
            int nextNumber = nums[i];
            while (exploredValue.containsKey(nextNumber) && exploredValue.get(nextNumber) == false) {
                exploredValue.put(nextNumber, true);
                currentLongest += 1;
                nextNumber = nextNumber + 1;
            }

            int prevNumber = nums[i] - 1;
            while (exploredValue.containsKey(prevNumber) && exploredValue.get(prevNumber) == false) {
                exploredValue.put(prevNumber, true);
                currentLongest += 1;
                prevNumber = prevNumber - 1;
            }

            longestSequence = Math.max(longestSequence, currentLongest);
        }
        return longestSequence;
    }
}
