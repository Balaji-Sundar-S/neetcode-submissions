class Solution {
    public int maxArea(int[] heights) {
        
        int low = 0;
        int high = heights.length - 1;
        int length = heights.length - 1;
        int res = 0;

        while (length > 0) {
            int width = Math.min(heights[low], heights[high]);
            int currentResult = length * width;
            res = Math.max(currentResult, res);
            length-=1;
            if (heights[low] <= heights[high]) {
                low++;
            } else if (heights[low] > heights[high]) {
                high--;
            }
        }

        return res;
    }
}
