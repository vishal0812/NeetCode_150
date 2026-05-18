class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1){
            return nums[0];
        }
        return Math.max(houseRobber(nums,0,n-1),houseRobber(nums,1,n));
    }

    public int houseRobber(int[] nums, int i, int n) {
        int dp[] = new int[n];
        Arrays.fill(dp,-1);
        return helper(nums, i, n, dp);

    }
    public int helper(int nums[], int i, int n, int dp[]){
        if(i>=n){
            return 0;
        }
        if(dp[i] != -1){
            return dp[i];
        }
        int steal = nums[i] + helper(nums, i+2, n, dp);
        int skip = helper(nums, i+1, n, dp);
        return dp[i] = Math.max(steal, skip);
    }
}
