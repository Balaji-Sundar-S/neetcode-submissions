class Solution {
    public boolean isPalindrome(String s) {
        char[] input = s.toCharArray();
        int start = 0;
        int end = input.length - 1;
        while (start < end) {
            if (!Character.isLetterOrDigit(input[start])) {
                start += 1;
                continue;
            }
            if (!Character.isLetterOrDigit(input[end])) {
                end -= 1;
                continue;
            }
            if (Character.toLowerCase(input[start]) != Character.toLowerCase(input[end])) {
                return false;
            }
            start += 1;
            end -= 1;
        }
        return true;
    }
}
