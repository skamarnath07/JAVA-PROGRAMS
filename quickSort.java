import java.util.*;
public class quickSort {
    void qsort(List<Integer> arr,int low,int high)
    {
        if(low<high)
        {
            int pat=sort(arr,low,high);
            qsort(arr,low,pat-1);
            qsort(arr,pat+1,high);
        }
    }
    int sort(List<Integer> arr,int low,int high)
    {
        int piv=arr.get(low);
        int i=low;
        int j=high;
        while(i<j)
        {
            while(arr.get(i)<=piv && i<=high)
            {
                i++;
            }
            while(arr.get(j)>piv && j>=low)
            {
                j--;
            }
            if(i<j)
            {
                int temp=arr.get(i);
                arr.set(i,arr.get(j));
                arr.set(j,temp);

            }

            


        }
        arr.set(low, arr.get(j));
        arr.set(j, piv);

        return j;
        
    }
    public static void main(String[] args) {
        List<Integer> arr=new ArrayList<>(Arrays.asList(4,6,2,5,7,9,1,3));
        int low=0;
        int high=arr.size()-1;
        quickSort q=new quickSort();
        q.qsort(arr,low,high);
        System.out.println(arr);

    }
}
