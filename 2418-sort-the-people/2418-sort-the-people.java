class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;
        int people[][] = new int[n][2];
        for(int i = 0;i<n;i++){
            people[i][0] = heights[i];
            people[i][1] = i;
        }
        Arrays.sort(people,(a,b) ->b[0]-a[0]);
        String[] ans = new String[n];
        for(int i = 0;i<n;i++){
            ans[i] = names[people[i][1]];
        }
        return ans;
    }
}