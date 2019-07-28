

    import java.util.*;
    // Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

    class cipher {
    public static void main(String args[] ) throws Exception {

    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    int n=sc.nextInt();
    char c[]=s.toCharArray();

    for(int i=0;i<s.length();i++)
    {
    if(c[i]>=97 && c[i]<=122)
    {
    if((c[i]+n)>122)
    {
    int offset=(c[i]+n-97)%26;
    c[i]=(char)(97+offset);
    }
    else
    c[i]=(char)(c[i]+n);
    }

    if(c[i]>=65 && c[i]<=90)
    {

    if((c[i]+n)>90)
    {
    int offset=(c[i]+n-65)%26;
    c[i]=(char)(65+offset);
    }
    else
    c[i]=(char)(c[i]+n);
    }

    if(c[i]>=48 && c[i]<=57)
    {
    if((c[i]+n)>57)
    {
    int offset=(c[i]+n-48)%10;
    c[i]=(char)(48+offset);
    }
    else
    c[i]=(char)(c[i]+n);
    }
    }

    for(int i=0;i<s.length();i++)
    System.out.print(c[i]);

    }
    }
