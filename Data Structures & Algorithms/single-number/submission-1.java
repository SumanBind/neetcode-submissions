class Solution 
{
    public int singleNumber(int[] nums) 
    {
        int r=0;
        for(int a:nums)
        {
            r=r^a;
        }
        return r;
    }
}
