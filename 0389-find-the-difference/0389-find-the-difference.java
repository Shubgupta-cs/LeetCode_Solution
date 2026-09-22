class Solution {
    public char findTheDifference(String s, String t) {
        Map<Character,Integer> map1 = new HashMap<>();
        for(char c : s.toCharArray()){
            map1.put(c,map1.getOrDefault(c,0)+1);
        }
        Map<Character,Integer> map2 = new HashMap<>();
        for(char c : t.toCharArray()){
            map2.put(c,map2.getOrDefault(c,0)+1);
        }
        for(char c : map2.keySet()){
            if(map2.get(c)>map1.getOrDefault(c,0)) return c;
        }
    return ' ';
    }
}