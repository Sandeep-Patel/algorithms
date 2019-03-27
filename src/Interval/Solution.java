package Interval;

import java.util.*;

/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {

    public static void main(String[] args) {
        Interval i1 = new Interval(1,4);
        Interval i2 = new Interval(0,0);
        List<Interval> result = new Solution().merge(Arrays.asList(i1,i2));
        for(Interval i: result) {
            System.out.print("[");
            System.out.print(i.start);
            System.out.print(", ");
            System.out.print(i.end);
            System.out.println("]");
        }
    }


    public List<Interval> merge(List<Interval> intervals) {
        List<Interval> output = new ArrayList<>();
        Collections.sort(intervals, Comparator.comparing(interval -> interval.start));
        for(int i=0; i< intervals.size(); i++) {
            Interval newInterval = intervals.get(i);
            int j= i+1;
            if(j<intervals.size()) {
                Interval intJ = intervals.get(j);
                while((intJ.start <= newInterval.end || intJ.end<=newInterval.end) && j<intervals.size()) {
                    newInterval.end=Math.max(intJ.end, newInterval.end);
                    newInterval.start=Math.min(intJ.start, newInterval.start);
                    j++;
                    i++;
                    if(j<intervals.size()) {
                        intJ = intervals.get(j);
                    }
                }
            }
            
            output.add(newInterval);
        }
        
        return output;
    }
}