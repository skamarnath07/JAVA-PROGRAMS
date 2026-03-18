class rot{
    void rotate(int[] nums,int k)
    {
       
   
        int n=nums.length;
        k=k%n;
        int c=0;
        int temp;
        for(int i=0,j=1;i<(n-k)/2;i++)
        {
             temp=nums[i];
            nums[i]=nums[n-k-j];
            nums[n-k-j]=temp;
            j++;
            c++;
        }

        for(int n1:nums)
       {
        System.out.print(n1);
       }
       System.out.println("  "+c);
       c=0;
       for(int i=0;i<k/2;i++)
       {
        temp=nums[n-k+i];
        nums[n-k+i]=nums[n-i-1];
        nums[n-i-1]=temp;
        c++;
       }
        for(int n1:nums)
       {
        System.out.print(n1);
       }
       System.out.println("  "+c);
       c=0;
       for(int i=0;i<n/2;i++){
        temp=nums[i];
        nums[i]=nums[n-i-1];
        nums[n-i-1]=temp;
        c++;
       }
        for(int n1:nums)
       {
        System.out.print(n1);
       }
       System.out.println("  "+c);

    }

        
    
    public static void main(String[] args) {
        rot r=new rot();
        int[] nums={1,2,3,4,5,6,7};
        int k=23;
        r.rotate(nums, k);
       for(int n:nums)
       {
        System.out.print(n);
       }
    }
}