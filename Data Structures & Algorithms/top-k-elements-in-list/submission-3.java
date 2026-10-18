class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> frequency = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (frequency.containsKey(nums[i])) {
                int count = frequency.get(nums[i]);
                count += 1;
                frequency.put(nums[i], count);
            } else {
                frequency.put(nums[i], 1);
            }
        }
        List<Integer>[] bucket = new ArrayList[nums.length+1];
        for (int j = 0; j < bucket.length; j++) {
            bucket[j] = new ArrayList<Integer>();
        }
        for (int freq : frequency.keySet()) {
            int val = frequency.get(freq);
            bucket[val].add(freq);
        }
        for (int m = bucket.length - 1; m >= 0; m--) {
            for (int num : bucket[m]) {
                res.add(num);
                if (res.size() == k) {
                    break;
                }
            }
            if (res.size() == k) {
                break;
            }
        }
        return res.stream()
            .mapToInt(Integer::intValue)
            .toArray();
    }
}
