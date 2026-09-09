class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int n = s.length;
        if(n==0) return 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int max =0;
        int cookies = n-1;
        int child= g.length-1;
        while(cookies >=0 && child>=0){
            if(s[cookies] >= g[child]){
                max++;
                cookies--;
                child--;
            }
            else{
                child--;
            }
        }
        return max;
    }
}