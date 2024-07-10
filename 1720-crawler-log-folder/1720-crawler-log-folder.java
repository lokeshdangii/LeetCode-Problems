class Solution {
    public int minOperations(String[] logs) {
        Stack<String> st = new Stack<>();

        for (String str : logs) {
            if (!str.equals("../") && !str.equals("./")) {
                st.push(str);
            } else {
                if (str.equals("../")) {
                    if (!st.isEmpty()) {
                        st.pop();
                    }
                }
            }
        }

        return st.size();
    }
}
