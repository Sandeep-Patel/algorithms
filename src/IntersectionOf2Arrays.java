import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 Given two arrays, write a function to compute their intersection.

 Example 1:

 Input: nums1 = [1,2,2,1], nums2 = [2,2]
 Output: [2,2]
 Example 2:

 Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 Output: [4,9]
 Note:

 Each element in the result should appear as many times as it shows in both arrays.
 The result can be in any order.
 Follow up:

 What if the given array is already sorted? How would you optimize your algorithm?
 What if nums1's size is small compared to nums2's size? Which algorithm is better?
 What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?

 */
class IntersectionOf2Arrays {

    public static void main(String[] args) {
        int n1[] = {1,2,2,5};
        int n2[] = {2,1,2,1};
        printArray(n1);
        printArray(n2);
        int res[] = new IntersectionOf2Arrays().intersect(n1,n2);
        printArray(res);

    }

    private static void printArray(int n[]) {
        System.out.print("[");
        if(n!=null) {
            for (int i : n) {
                System.out.print(i + " ");
            }
        }
        System.out.println("]");
    }


    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1 == null || nums2 == null || nums1.length ==0 || nums2.length==0) {
            return new int[0];
        }

        if(nums1.length > nums2.length) {
            return intersect(nums2, nums1);
        }

        List<Integer> ret = new ArrayList<>();
        List<Integer> num1List = toList(nums1);
        List<Integer> num2List = toList(nums2);
        for(Integer num: num1List) {
            if(num2List.contains(num)) {
                ret.add(num);
                num2List.remove(num);
            }
        }
        int[] primitive = ret.stream()
                .mapToInt(Integer::intValue)
                .toArray();

        return primitive;
    }

    private static List<Integer>  toList(int[] ints) {
        List<Integer> intList = new ArrayList<Integer>();
        for (int i : ints)
        {
            intList.add(i);
        }

        return intList;
    }

}