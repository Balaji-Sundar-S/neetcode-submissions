class Solution {
    public boolean isPalindrome(String s) {
        
        String inp = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        inp.replaceAll("\\s", "");

        String sb = new StringBuilder(inp).reverse().toString();

        if (inp.equals(sb)) {
            return true;
        } else {
            return false;
        }
    }
}
