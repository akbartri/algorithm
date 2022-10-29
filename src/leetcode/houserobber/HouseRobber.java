package leetcode.houserobber;
public class HouseRobber {
    public static void main(String[] args) {
//        You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them
//        is that adjacent houses have security systems connected and it will automatically contact the police if two adjacent houses were broken into on the same night.
//
//        Given an integer array nums representing the amount of money of each house, return the maximum amount of money you can rob tonight without alerting the police.

//        [3,2,1,3]
//        [2,7,9,3,1]

        System.out.println(rob(new int[]{2,7,9,3,1}));
    }

    private static int rob(int[] nums) {
        int[] temp = new int[nums.length+1];
        temp[0] = 0;
        temp[1] = nums[0];

        for(int i=1;i<nums.length;i++) {
            temp[i+1] = Math.max(temp[i],temp[i-1]+nums[i]);
        }

        return temp[nums.length];
    }
}
