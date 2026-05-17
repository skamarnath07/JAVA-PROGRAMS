public class moores {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int cnt=0;
        int ele=-1;
        for(int i=0;i<n;i++)
        {
            if(cnt==0)
            {
                cnt=1;
                ele=nums[i];
            }
            else if(nums[i]==ele)
            {
                cnt++;
            }
            else
            {
                cnt--;
            }
        }
       return ele;
    }
    public static void main(String[] args) {
        moores m=new moores();
        int[] nums={2,3,2,1,2,2,1,2};
       int ele= m.majorityElement(nums);
       System.out.println(ele);
    }
}
