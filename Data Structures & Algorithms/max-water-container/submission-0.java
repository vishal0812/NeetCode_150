class Solution {
    public int maxArea(int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = n-1;
        int ans = 0;
        while(i<j){
            int currArea = Math.min(nums[i], nums[j])*(j-i);
            ans = Math.max(ans, currArea);
            if(nums[i] < nums[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return ans;
    }
}
