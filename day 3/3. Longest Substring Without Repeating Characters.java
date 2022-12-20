class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Integer,Integer> mp = new HashMap();
        int currLength = 0;
        int maxLength = 0;
        int start = 0;
        for(int i=0;i<s.length();i++) {
            if(mp.containsKey(s.charAt(i)-'a') && mp.get(s.charAt(i)-'a') >=start) {
                maxLength = Math.max(maxLength, currLength);
                currLength = i -mp.get(s.charAt(i)-'a' );
                start = mp.get(s.charAt(i)-'a' )+1;
            }else {
               currLength++;
            }
            mp.put(s.charAt(i)-'a', i);
        }
        return Math.max(maxLength, currLength);
    }
}
