
public class zero {
    public void moveZeros(int[] a,int n)
    {
        int j=-1;
        for(int i=0;i<n;i++)
        {
            if(a[i]==0)
            {
                j=i;
                break;
            }
        }
        if(j==-1) return;
        for (int i=j+1;i<n;i++)
        {
            if(a[i]!=0)
            {
                int t=a[i];
                a[i]=a[j];
                a[j]=t;
                j++;
            }
        }
    }
    public static void main(String[] args) {
        int[] nums={1,0,3,0,5,6,0};
        zero z=new zero();
        z.moveZeros(nums, nums.length);
        for(int n:nums)
        {
            System.out.print(n);
        }
    }
}
