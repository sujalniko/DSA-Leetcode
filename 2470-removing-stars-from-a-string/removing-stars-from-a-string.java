class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();
        for(char i : s.toCharArray()){
            if(st.isEmpty()){
                if(i == '*'){
                    continue;
                }
                st.push(i);
            }else{
                if(i=='*'){
                st.pop();
            }else{
                st.push(i);
            }
            }  
        }
        String ans = st.stream().map(Object::toString).collect(Collectors.joining(""));
        return ans;
    }
}