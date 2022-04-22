class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int a = 0;
        for(int i = 0 ; i < arr.length ; i++){
            int b = 0;
            int c = 0;
            for(int j = i ; j < arr.length ; j++){
                c++;
                b+=arr[j];
                if (c%2!=0){
                    a+=b;
                    }
                }
            }
        return a;
    }
}