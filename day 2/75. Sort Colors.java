class Solution {
    public void sortColors(int[] nums) {
        /*Arrays.sort(nums);*/
        int min=nums[0],k=0,temp;
        for(int i=0;i<nums.length-1;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(min>nums[j])
                {
                    min=nums[j];
                    k=j;
                }
            }if(min<nums[i])
            {
                temp=nums[i];
                nums[i]=min;
                nums[k]=temp;
            }
            min=nums[i+1];
        }
    }
}
