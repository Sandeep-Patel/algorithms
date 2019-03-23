package math;

/**

 You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed,
 the only constraint stopping you from robbing each of them is that adjacent houses have security system connected and
 it will automatically contact the police if two adjacent houses were broken into on the same night.

 Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money you can rob tonight without alerting the police.

 Example 1:

 Input: [1,2,3,1]
 Output: 4
 Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
 Total amount you can rob = 1 + 3 = 4.
 Example 2:

 Input: [2,7,9,3,1,2]
 Output: 13
 Explanation: Rob house 1 (money = 2), rob house 3 (money = 9) and rob house 6 (money = 2).
 Total amount you can rob = 2 + 9 + 2 = 13.


 */
class HouseRobber {

    public static void main(String[] args) {
        int n[] = {2,7,9,3,1,2};
        int res = new HouseRobber().rob(n);
        System.out.println("Output : " + res);

    }

    public int rob(int[] nums) {

        int l = nums.length;
        if (l == 0){
            return 0;
        }

        int[] robbedmoney = new int[l];

        for(int i=0; i< l; i++) {
            if (i == 0){
                robbedmoney[i] = nums[i];
            }
            else if (i == 1){
                robbedmoney[i] = Math.max(nums[i], nums[i-1]);
            }
            else{
                robbedmoney[i] = Math.max(robbedmoney[i - 2] + nums[i], robbedmoney[i-1]);
            }
        }

        return robbedmoney[l - 1];
    }
}