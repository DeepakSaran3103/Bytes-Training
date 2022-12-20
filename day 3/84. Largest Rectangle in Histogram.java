class Solution {
    public int largestRectangleArea(int[] h) {
        Stack<Integer> st = new Stack<>();
        int maxi = 0;
        int n = h.length;
        for(int i = 0 ; i <= n ; i++){
            while(!st.isEmpty() && (i == n || h[st.peek()] >= h[i])){
                int hgt = h[st.peek()];
                st.pop();
                int width;
                if(st.isEmpty())    width = i;
                else     width = i-st.peek() - 1;
                maxi = Math.max(maxi , width*hgt);
            }
            st.push(i);
        }
        return maxi;
    }
}
