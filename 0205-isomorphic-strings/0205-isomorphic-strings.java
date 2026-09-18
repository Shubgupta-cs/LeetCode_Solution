class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> mp=new HashMap<>();
        HashMap<Character,Character> mp1=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            char ch1=t.charAt(i);
            if(mp.containsKey(ch)){
                if(mp.get(ch) != ch1) return false;
            }else{
                mp.put(ch,ch1);
            }
            if(mp1.containsKey(ch1)){
                if(mp1.get(ch1) !=ch) return false;
            }else{
                mp1.put(ch1,ch);
            }
        }
        return true;
    }
}