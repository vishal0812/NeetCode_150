/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int i=0; i<intervals.size(); i++){
            int l = intervals.get(i).start;
            int r = intervals.get(i).end;
            map.put(l, map.getOrDefault(l,0)+1);
            map.put(r, map.getOrDefault(r,0)-1);
        }
        int result = 0;
        int curr = 0;
        for(Map.Entry<Integer, Integer> e : map.entrySet()){
            curr += e.getValue();
            result = Math.max(result, curr);
        }
        return result;
    }
}
