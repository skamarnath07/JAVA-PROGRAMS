import java.util.Arrays;
import java.util.Scanner;

public class DNF {

    public void sortColors(int[] nums) {
        int low=0, mid=0,high=nums.length-1;
        while(mid<=high)
        {
            if(nums[mid]==0)
            {
                int temp=nums[low];
                nums[low]=nums[mid];
                nums[mid]=temp;
                low++;
                mid++;
            }
            else if(nums[mid]==1)
            {
                mid++;
            }
            else{
                int temp=nums[mid];
                nums[mid]=nums[high];
                nums[high]=temp;
                high--;
            }
        }
    }
    public static void main(String[] args) {
        DNF D=new DNF();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of Array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter"+ n +"elements of 0's 1's and 2's");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        D.sortColors(arr);

        System.out.println(Arrays.toString(arr));

    }
}

