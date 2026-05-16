class Solution {
    public boolean isValid(String str) {

        Deque<Character> st=  new ArrayDeque<>();
        for (char ch : str.toCharArray()){
            if(ch == '(' || ch =='{' || ch == '['){
                st.push(ch);
            }
            else{
                if(st.isEmpty()) return false;
                char top = st.pop();

                if((ch == ')' && top!='(') ||
                (ch=='}' && top!='{')||
                (ch == ']' && top!= '[')){
                    return false;
                }

            }
        }


        return st.isEmpty();
    }
}