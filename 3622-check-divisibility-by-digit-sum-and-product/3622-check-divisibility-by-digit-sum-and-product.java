class Solution {
    public boolean checkDivisibility(int n) {
        int mul=1,sum=0;
        int dup=n;
        while(dup>0){
            int temp = dup%10;
            mul *= temp;
            sum += temp;
            dup/=10;
        }
        sum += mul;
        return (n%sum)==0 ?true:false;
    }
}