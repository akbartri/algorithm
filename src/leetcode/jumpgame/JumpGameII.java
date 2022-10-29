package leetcode.jumpgame;

public class JumpGameII {
    public static void main(String[] args) {
        System.out.println(jump(new int[]{1,2}));
    }

    private static int jump(int[] nums) {
        if(nums.length<2)return 0;

        if(nums[0]>=nums.length-1)return 1;

        //2,3,1,1,4

        int value = nums[0];
        int count = 1;
        int i=1;
        int maxIndex = nums.length;
        while(value<maxIndex) {
            int currentValue = nums[i];
            value += currentValue;
            value-=1;
            i+=1;
            maxIndex-=1;
            if(currentValue>0)count+=1;
        }

        return count;
    }
}
