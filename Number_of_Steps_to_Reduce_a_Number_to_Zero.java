class Solution {
    public int numberOfSteps(int num) {
        int b = 0;
        while(num>0){
            if (num%2==0){
                num/=2;
                b+=1;
            }
            else{
                num-=1;
                b+=1;
            } 
        }
        return b;
    }
}