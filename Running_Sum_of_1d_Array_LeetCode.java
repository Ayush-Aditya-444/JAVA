class Solution {
    public int[] runningSum(int[] nums) {
        int[] array1 = new int[nums.length];
        int a = 0;
        for (int i = 0 ; i < nums.length ; i++){
            a=a+nums[i];
            array1 [i] = a;
        }
        return array1;

    }
}