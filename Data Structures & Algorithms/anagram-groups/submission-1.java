class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        ArrayList<List<String>> res = new ArrayList<>();
        for (int i = 0; i < strs.length; i++) {
            String sortedWord = SortTheWord(strs[i]);
            if (map.containsKey(sortedWord)) {
            } else {
                map.put(sortedWord, new ArrayList<String>());
            }
            map.get(sortedWord).add(strs[i]);
        }
        for (String i : map.keySet()) {
            res.add(map.get(i));
        }
        return res;
    }
    public String SortTheWord(String word) {
        char[] charArray = word.toCharArray();
        Arrays.sort(charArray);
        String afterSort = new String(charArray);
        return afterSort;
    }
}
