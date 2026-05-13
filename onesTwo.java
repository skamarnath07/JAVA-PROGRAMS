 import java.util.ArrayList;
 import java.util.Arrays;
 import java.util.List;
 public class onesTwo {
    public int singleNumber(int[] nums) {
        int x=0;
        for(int i=0;i<nums.length;i++)
        {
             x=x^nums[i];
        }
        return x;
    }
    public static void main(String[] args) {
        onesTwo o=new onesTwo();
        int[] arr={1,1,2,3,3,4,4};
       System.out.println(o.singleNumber(arr)); 
    }
}