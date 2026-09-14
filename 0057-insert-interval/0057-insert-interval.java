class Solution {
    public int[][] insert(int[][] in, int[] newin) {
        int n = in.length;
        // Arrays.sort(in,(a,b) -> Integer.compare(a[0],b[0]));
        List<int[]> ans = new  ArrayList<>();
        int i = 0;
        while(i<n && in[i][1] < newin[0]){
            ans.add(in[i]);
            i++;
        }
        while(i<n && in[i][0] <= newin[1]){
            newin[0] = Math.min(in[i][0],newin[0]);
            newin[1] = Math.max(in[i][1],newin[1]);
            i++;
        }
        ans.add(newin);
        while(i<n){
            ans.add(in[i]);
            i++;
        }
        return ans.toArray(new int[ans.size()][]);
    }
}