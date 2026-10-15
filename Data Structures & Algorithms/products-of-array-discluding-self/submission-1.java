class Solution {
    public int[] productExceptSelf(int[] nums) {
     int leftProduct = 1;
        int rightProduct = 1;
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            res[i] = leftProduct;
            leftProduct = leftProduct * nums[i];
        }
        for (int j = nums.length-1; j >= 0; j--) {
            res[j] = rightProduct * res[j];
            rightProduct = rightProduct * nums[j];
        }
        return res;   
    }
}  
