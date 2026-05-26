class Solution {
    public int minEatingSpeed(int[] nums, int h) {
        int maxi = nums[0];
        for(int i=1; i<nums.length; i++){   
            maxi = Math.max(maxi, nums[i]);
        }
        int i = 1;
        int j = maxi;
        while(i <= j){
            int mid = (i+j)/2;
            if(isPossible(nums, mid, h)){
                j = mid-1;
            }
            else{
                i = mid+1;
            }
        }
        return i;
    }
    public boolean isPossible(int nums[], int k, int h){
        int currTime = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] % k == 0){
                currTime += nums[i] / k;
            }
            else{
                currTime += nums[i] / k + 1;
            }
        }
        if(currTime <= h){
            return true;
        }
        return false;
    }
}
