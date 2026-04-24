class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer>[] bucket = new List[nums.length + 1];
        Arrays.sort(nums);

        for (int i : nums) {
            if (!map.containsKey(i)) {
                map.put(i, 0);
            }
            int value = map.get(i);
            map.put(i, value+1);
        }

        for (int key : map.keySet()) {
            int frequency = map.get(key);
            if (bucket[frequency] == null) {
                bucket[frequency] = new ArrayList<>();
            }
            bucket[frequency].add(key);
        }

        int[] res = new int[k];
        int counter = 0;

        for (int i = bucket.length-1; i >= 0 && counter < k; i--) {
            if (bucket[i] != null) {
                for (int j : bucket[i]) {
                    res[counter] = j;
                    counter++;
                }
            }
        }
        return res;
    }
}
