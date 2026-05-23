class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int ele : nums){
            map.put(ele, map.getOrDefault(ele,0)+1);
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[1]-b[1]);
        for(Map.Entry<Integer, Integer> obj: map.entrySet()){
            int key = obj.getKey();
            int val = obj.getValue();
            pq.add(new int[]{key, val});
            if(pq.size()>k){
                pq.poll();
            }
        }
        int ans[] = new int[k];
        int i=0;
        while(!pq.isEmpty()){
            int [] curr = pq.poll();
            ans[i] = curr[0];
            i++;
        }
        return ans;
    }
}
