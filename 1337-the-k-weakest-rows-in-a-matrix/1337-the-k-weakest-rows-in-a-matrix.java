class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int row = mat.length;
        int col = mat[0].length;
        int[][] st = new int[row][2];
        for(int i = 0;i<row;i++){
            int count = 0;
            for(int j = 0;j<col;j++){
                if(mat[i][j] == 1){
                    count++;
                }

            }
            st[i][0] = count;
            st[i][1] = i;
        }
        Arrays.sort(st,(a,b)->{
            if(a[0] == b[0]){
                return a[1]-b[1];
            }
            return a[0]-b[0];
        });
        int[] ans = new int[k];
        for(int i = 0;i<k;i++){
            ans[i] = st[i][1];
        }
        return ans;
    }
}