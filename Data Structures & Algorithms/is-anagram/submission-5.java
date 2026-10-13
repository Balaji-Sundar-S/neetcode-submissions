class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> frequency_count = new HashMap<>();
        for (int i = 0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if (frequency_count.containsKey(ch)) {
                int current_count = frequency_count.get(ch);
                current_count += 1;
                frequency_count.put(ch, current_count);
            } else {
                frequency_count.put(ch, 1);
            }
        }
        for (int j=0; j<t.length(); j++) {
            char ch = t.charAt(j);
            if (frequency_count.containsKey(ch)) {
                int current_count = frequency_count.get(ch);
                current_count -= 1;
                frequency_count.put(ch, current_count);
            } else {
                frequency_count.put(ch, 1);
            }
        }
        for (char ch : frequency_count.keySet()) {
            if (frequency_count.get(ch) != 0) {
                return false;
            }
        }
        return true;
    }
}
