class Solution {
    public int[][] merge(int[][] in) {
        if(in.length<=1) return in;
        Arrays.sort(in,(a,b) -> Integer.compare(a[0],b[0]));
        ArrayList<int[]> ans = new ArrayList<>();
        int[] curr = in[0];
        ans.add(curr);
        for(int[] next :in){
            if(curr[1]>=next[0]){
                curr[1] = Math.max(curr[1],next[1]);
            }
            else{
                curr = next;
                ans.add(curr);
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
}