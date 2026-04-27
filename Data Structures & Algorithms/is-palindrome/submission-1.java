class Solution {
    public boolean isPalindrome(String s) {
        
        String inp = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        inp.replaceAll("\\s", "");
        char[] charArray = inp.toCharArray();

        int low = 0;
        int high = inp.length()-1;

        while (low < high) {
            if (charArray[low] != charArray[high]) {
                return false;
            }
            low++;
            high--;
        }
        return true;
    }
}
