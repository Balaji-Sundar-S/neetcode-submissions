class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for (char i : s.toCharArray()) {
            if (map.containsKey(i)) {
                int count = map.get(i);
                count += 1;
                System.out.println(i + " " + count);
                map.put(i, count);
            } else {
                map.put(i, 1);
            }
        }
        for (char j : t.toCharArray()) {
            if (map.containsKey(j)) {
                int count = map.get(j);
                count -= 1;
                System.out.println(j + " " + count);
                map.put(j, count);
            } else {
                map.put(j, 1);
            }
        }
        for (char i : map.keySet()) {
            System.out.println(i + " " + map.get(i));
            if (map.get(i) != 0) {
                return false;
            }
        }
        return true;
    }
}
