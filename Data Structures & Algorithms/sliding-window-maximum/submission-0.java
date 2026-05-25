class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        int n = nums.length;
        int ans[] = new int[n-k+1];
        int i = 0;
        int p = 0;
        while(i < n){
            
            while(!dq.isEmpty() && dq.peekFirst() <= i-k){
                dq.pollFirst();
            }
            while(!dq.isEmpty() && nums[dq.peekLast()] < nums[i]){
                dq.pollLast();
            }
            dq.addLast(i);
            if(i-k+1 >= 0){
                ans[p] = nums[dq.peekFirst()];
                p++;
            }
            
            i++;
        }
        return ans;
    }
}
