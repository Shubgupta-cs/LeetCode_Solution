class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(char ch : num.toCharArray()){
            while(!st.isEmpty() && k>0 && st.peek()>ch){
                st.pop();
                k--;
            }
            st.push(ch);
        }
        while(!st.isEmpty() && k>0){
            st.pop();
            k--;
        }
        for(char ch : st){
            sb.append(ch);
        }
        while(sb.length()>0 && sb.charAt(0) == '0' ){
            sb.deleteCharAt(0);
        }
        if(sb.length() == 0){
            return "0";
        }
        return sb.toString();
    }
}