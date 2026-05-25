class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> st = new Stack<>();
        for(int i = 0; i<tokens.length; i++){
            if(tokens[i].equals("+")){
                String b = st.pop();
                String a = st.pop();
                int y = Integer.parseInt(b);
                int x = Integer.parseInt(a);
                int z = x + y;
                String curr = String.valueOf(z);
                st.push(curr);
            }
            else if(tokens[i].equals("-")){
                String b = st.pop();
                String a = st.pop();
                int y = Integer.parseInt(b);
                int x = Integer.parseInt(a);
                int z = x - y;
                String curr = String.valueOf(z);
                st.push(curr);
            }
            else if(tokens[i].equals("*")){
                String b = st.pop();
                String a = st.pop();
                int y = Integer.parseInt(b);
                int x = Integer.parseInt(a);
                int z = x * y;
                String curr = String.valueOf(z);
                st.push(curr);
            }
            else if(tokens[i].equals("/")){
                String b = st.pop();
                String a = st.pop();
                int y = Integer.parseInt(b);
                int x = Integer.parseInt(a);
                int z = x / y;
                String curr = String.valueOf(z);
                st.push(curr);
            }
            else{
                st.push(tokens[i]);
            }
        }
        int ans = Integer.parseInt(st.pop());
        return ans;
    }
}
