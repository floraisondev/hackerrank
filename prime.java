import java.util.*;
class prime {
    public static void main(String args[] ) throws Exception {


        // Write your code here

        Scanner s = new Scanner(System.in);
        int i=0,num=0;
        String primeNumbers="";
       int n= s.nextInt();

       for (i = 1; i <= n; i++)
      {
         int counter=0;
         for(num =i; num>=1; num--)
         {
	    if(i%num==0)
	    {
		counter = counter + 1;
	    }
	 }
	 if (counter ==2)
	 {

	    primeNumbers = primeNumbers + i + " ";
	 }
      }

      System.out.println(primeNumbers);
   }
       }
