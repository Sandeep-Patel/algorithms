package linkedlist;

import java.util.*;

/**
 You are asked to cut off trees in a forest for a golf event. The forest is represented as a non-negative 2D map, in this map:

 0 represents the obstacle can't be reached.
 1 represents the ground can be walked through.
 The place with number bigger than 1 represents a tree can be walked through, and this positive number represents the tree's height.


 You are asked to cut off all the trees in this forest in the order of tree's height - always cut off the tree with lowest height first. And after cutting, the original place has the tree will become a grass (value 1).

 You will start from the point (0, 0) and you should output the minimum steps you need to walk to cut off all the trees. If you can't cut off all the trees, output -1 in that situation.

 You are guaranteed that no two trees have the same height and there is at least one tree needs to be cut off.

 Example 1:

 Input:
 [
 [1,2,3],
 [0,0,4],
 [7,6,5]
 ]
 Output: 6


 Example 2:

 Input:
 [
 [1,2,3],
 [0,0,0],
 [7,6,5]
 ]
 Output: -1


 Example 3:

 Input:
 [
 [2,3,4],
 [0,0,5],
 [8,7,6]
 ]
 Output: 6
 Explanation: You started from the point (0,0) and you can cut off the tree in (0,0) directly without walking.


 Hint: size of the given matrix will not exceed 50x50.

 //TODO: Not working
 */
public class SolutionTreeCut2DArray {

    public static void main(String[] args) {
        ArrayList<List<Integer>> l = new ArrayList<>();
        List<Integer> a = new ArrayList<>();
        a.add(1);a.add(2);a.add(3);
        l.add(a);
        l.add(Arrays.asList(0,0,4));
                l.add(Arrays.asList(7,6,5));
        System.out.println(new SolutionTreeCut2DArray().mostCommonWord(l));
    }
    public int mostCommonWord(ArrayList<List<Integer>> list) {

        int ret = 0;
        int j=0;
        for(int i=0; i< list.size()-1 && j<list.size()-1;) {

            if(list.get(i).get(j)>1) {
                list.get(i).add(j, list.get(i).get(j)-1);
            }
            ret++;

            if(list.get(i).get(j+1)!=0 && j<list.size()-1) {
                j++;
            } else if(list.get(i+1).get(j)!=0 && i<list.size()-1) {
                i++;
            } else {
                if(j==list.size()){
                    i++;
                } else if(i==list.size()){
                    j++;
                }
                return ret;
            }
        }


        return ret;
    }
}