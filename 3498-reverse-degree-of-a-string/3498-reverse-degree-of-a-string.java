class Solution {
    public int reverseDegree(String s) {
        int ans = 0;
        for(int i =0;i<s.length();i++){
            int sum = (26-(s.charAt(i)-'a'))*(i+1);
            ans += sum;
        }
        return ans;
    }
}