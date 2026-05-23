class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0;i<n-2;i++){
            if(i != 0 && nums[i] == nums[i-1]){
                continue;
            }
            twoSum(nums,i, ans);
        }
        return ans;
    }
    public void twoSum(int nums[], int f, List<List<Integer>> ans){
        int i = f+1;
        int j = nums.length - 1;
        while(i<j){
            
            int sum = nums[f] + nums[i] + nums[j];
            if(sum == 0){
                ArrayList<Integer> list = new ArrayList<>();
                list.add(nums[f]);
                list.add(nums[i]);
                list.add(nums[j]);
                ans.add(new ArrayList<>(list));
                i++;
                j--;
                while(i < j && nums[i] == nums[i-1]){
                    i++;
                }
                while(i < j && nums[j] == nums[j+1]){
                    j--;
                }
            }
            else if(sum < 0){
                i++;
            }
            else{
                j--;
            }
        }
    }

}
