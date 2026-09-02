class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> hs = new HashMap<>();
        for(String s:strs){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String k = new String(ch);
            if(!hs.containsKey(k)){
                List<String> st = new ArrayList<>();
                hs.put(k,st);
            }
            hs.get(k).add(s);
        }
        List<List<String>> ans = new ArrayList<>();
        for(List<String> gr:hs.values()){
            ans.add(gr);
        }
        return ans;
    }
}