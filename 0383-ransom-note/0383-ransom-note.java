class Solution {
    public boolean canConstruct(String a, String b) {
        if(a.length()>b.length()) return false;
        int[] alpha = new int[26];
        for(char c:b.toCharArray()){
            alpha[c-'a']++;
        }
        for(char c:a.toCharArray()){
            if(alpha[c-'a'] == 0) return false;
            alpha[c-'a']--;
        }
        return true;
    }
}