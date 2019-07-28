import java.util.*;

class palin{
    public static void main(String args[] ) throws Exception {


        // Write your code here
        Scanner s=new Scanner(System.in);
        String S=s.nextLine();
        String rev="";
        int l=S.length();
        for(int i=l-1;i>=0;i--)
           rev=rev+S.charAt(i);
        if(S.equals(rev))
         System.out.println("YES");
        else
         System.out.println("NO");
    }
}
