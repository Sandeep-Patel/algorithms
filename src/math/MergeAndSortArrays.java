package math;


/**

 Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

 Note:

 The number of elements initialized in nums1 and nums2 are m and n respectively.
 You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.
 Example:

 Input:
 nums1 = [1,2,3,0,0,0], m = 3
 nums2 = [2,5,6],       n = 3

 Output: [1,2,2,3,5,6]

 */

class MergeAndSortArrays {

    public static void main(String[] args) {


        int[] a = {1, 2, 3, 0, 0, 0};
        int n = 3;
        int[] b = {2, 5, 6};
        int m = 3;
        new MergeAndSortArrays().merge(a, m, b, n);

        System.out.print("Output : [");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ", ");
        }
        System.out.println("]");



    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int count=0;
        while(n>0) {
            nums1[m] = nums2[count++];
            m++;
            n--;
        }

        for(int i=0; i<nums1.length-1; i++) {
            for(int j=i+1; j<nums1.length;j++) {
                if(nums1[i]>nums1[j]) {
                    int t= nums1[i];
                    nums1[i] = nums1[j];
                    nums1[j] = t;
                }
            }
        }
    }
}