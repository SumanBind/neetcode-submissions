class Solution 
{
    public int[] countBits(int n) 
    {
        int a[]=new int [n+1];
        for(int i=0;i<=n;i++)
        {
            int count=0;
            int x=i;
            while(x>0)
            {
                int r=x%2;
                if(r==1)
                {
                    count++;
                }
                x/=2;
            }
            a[i]=count;
        }
        return a;
    }
}
