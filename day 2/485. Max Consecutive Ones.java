class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0,maxc=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
            {
                count++;
            }
            else
            {
                maxc=Math.max(maxc,count);
                count=0;
            }
        }
        maxc=Math.max(maxc,count);
        return maxc;
    }
}
