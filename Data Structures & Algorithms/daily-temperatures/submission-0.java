class Solution {
    public int[] dailyTemperatures(int[] nums) {
        int n = nums.length;
        int ans [] =new int [n];
        Stack<Integer> st = new Stack<>();
       
        ans[n-1] = 0;
        st.push(n-1);
        int i = n-2;
        while(i >= 0){
            int curr = nums[i];
            while(!st.isEmpty() && nums[st.peek()] <= curr){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i] = 0;
            }
            else{
                ans[i] = st.peek() - i;
            }
            st.push(i);
            i--;
        }
        return ans;
    }
}
