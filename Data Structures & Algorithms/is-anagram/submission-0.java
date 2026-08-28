class Solution 
{
    public boolean isAnagram(String s, String t) 
    {
        int n1=s.length();
        int n2=t.length();
        if(n1==n2)
        {
            char[] arr1 = s.toCharArray();
            Arrays.sort(arr1);
            char[] arr2 = t.toCharArray();
            Arrays.sort(arr2);
            int f=0;
            for(int i=0;i<n1;i++)
            {
                if(arr1[i]!=arr2[i])
                {
                    f=0;
                    break;
                }
                f++;
            }
            if(f!=0)
            {
                return true;
            }
            else
            {
                return false;
            }

        }
        return false;
    }
}
