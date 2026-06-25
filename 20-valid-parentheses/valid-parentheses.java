class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0; i<s.length(); i++){
            st.push(s.charAt(i));
            if(st.size()>1){
                if(st.peek()==')' && st.get(st.size() - 2)=='('){
                    st.pop();
                    st.pop();
                } 
            }
            if(st.size()>1){
                if(st.peek()=='}' && st.get(st.size() - 2)=='{'){
                    st.pop();
                    st.pop();
                }
            }
            if(st.size()>1){
                if(st.peek()==']' && st.get(st.size() - 2)=='['){
                    st.pop();
                    st.pop();
                }
            }
             
        }
        if(st.isEmpty()){
            return true;
        }
        return false;
    }
}