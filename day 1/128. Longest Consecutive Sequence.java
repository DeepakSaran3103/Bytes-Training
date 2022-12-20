class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
		for (int x : nums)
			set.add(x);

		int rsMax = 0, count;

		for (int x : nums) {
            if (!set.contains(x))
                continue;
            
			int l = x, r = x;
			count = 1;

			while (set.contains(--l)) {
				set.remove(l);
				count++;
			}
			while (set.contains(++r)) {
				set.remove(r);
				count++;
			}

			rsMax = Math.max(rsMax, count);
		}  

		return rsMax;
    }
}
