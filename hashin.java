import java.util.Scanner;

class hashin{
    public static void main(String[] args) {
        int[] hash=new int[256];
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A STRING TO GET CHARACTERS HOW MANY TIMES REAPTED");
        String str=sc.next();
        int n=str.length();
        for(int i=0;i<n;i++)
        {
            hash[str.charAt(i)]++;
        }
          for(int i=0;i<hash.length;i++)
        {
            if(hash[i]>0)
            {
                System.out.println((char)i + " : " + hash[i]);

            }
        }
        sc.close();
    }
}