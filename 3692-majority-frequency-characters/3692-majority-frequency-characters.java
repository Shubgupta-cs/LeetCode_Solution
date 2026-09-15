class Solution {
    public String majorityFrequencyGroup(String s) {
        char[] ch = s.toCharArray();
        int[] freq = new int[26];
        for(int i = 0;i<s.length();i++){
            freq[ch[i] - 'a']++;
        }
        int[] count = new int[101];
        for(int n : freq){
            if(n>0) count[n]++;
        }
        int maxs=0,bestf =0;
        for(int i =0;i<=100;i++){
            if(count[i]>maxs || (count[i] == maxs && i>bestf)){
                maxs=count[i];
                bestf = i;
            }
        }
        StringBuilder res= new StringBuilder();
        for(int i = 0;i<26;i++){
            if(freq[i] == bestf){
                res.append((char)(i+'a'));
            }
        }
        return res.toString();
    }
}