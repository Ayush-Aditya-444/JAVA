class Solution {
    public int minimumSum(int num) {
        int b=0;
        int[] array1 = new int[4];
        for (int i = 0 ; i < 4 ; i++){
            array1[i] = num%10;
            num=num/10;
        Arrays.sort(array1);
        b = array1[0]*10+array1[1]*10+array1[2]+array1[2];
        }
        return b;
    }
}