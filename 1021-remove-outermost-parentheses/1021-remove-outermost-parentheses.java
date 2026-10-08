class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int c = 0; 
        for(char a :s.toCharArray()){
            if(a == '('){
                if(c>0) sb.append(a);
                c++;
            }
            else{
                c--;
                if(c>0) sb.append(a);
            }
        }
        return sb.toString();
    }
}