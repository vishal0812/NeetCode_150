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
        int diff[] = new int[1000001];
        for(int i=0; i<intervals.size(); i++){
            int l = intervals.get(i).start;
            int r = intervals.get(i).end;
            diff[l] += 1;
            diff[r] -= 1;
        }
        int result = 0;
        int curr = 0;
        for(int i=0; i<diff.length; i++){
            curr += diff[i];
            result = Math.max(result, curr);
        }
        return result;
    }
}
