import java.util.ArrayList;
import java.util.List;
public class intersection {

    public static void main(String[] args) {
        int[] a={1,2,2,3,3,4,5,6};
        int[] b={2,3,3,5,6,6,7};
        List<Integer> ans=new ArrayList<>();
        int n1=a.length;
        int n2=b.length;
        int i=0;
        int j=0;
        while( i<n1 && j<n2){
            if(a[i]==b[j])
            {
                ans.add(a[i]);
                i++;
                j++;
            }
            else if(a[i]<b[j])
            {
                    i++;
                
            }
            else{
                j++;
            }
        }
        System.out.println(ans.toString());
        
    }
}
