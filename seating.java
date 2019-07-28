

    /* IMPORTANT: Multiple classes and nested static classes are supported */

    /*
     * uncomment this if you want to read input.
    //imports for BufferedReader
    import java.io.BufferedReader;
    import java.io.InputStreamReader;

    //import for Scanner and other utility classes
    import java.util.*;
    */

    // Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
    import java.util.*;
    class seating {
        public static void main(String args[] ) throws Exception {
            /* Sample code to perform I/O:
             * Use either of these methods for input

            //BufferedReader
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String name = br.readLine();                // Reading input from STDIN
            System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

            //Scanner
            Scanner s = new Scanner(System.in);
            String name = s.nextLine();                 // Reading input from STDIN
            System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

            */

            // Write your code here
            Scanner s=new Scanner(System.in);
            int T= s.nextInt();
            int N;
            for(int i=0;i<T;i++){
                N=s.nextInt();
                int ans;
                int mod=N%12;
                switch(mod)
                {
                    case 1:
                        {
                        if(mod==1 && N!=1)
                         ans=N+11;
                        else
                         ans=12;
                         System.out.println( ans +" WS");
                         break;
                        }
                    case 2:
                        {
                        if(mod==2 && N!=2)
                          ans=N+9;
                        else
                         ans=11;
                         System.out.println(ans+ " MS");
                         break;
                        }
                    case 3:
                        {
                        if(mod ==3 && N!=3)
                         ans=N+7;
                        else
                         ans=10;
                         System.out.println(ans+ " AS");
                         break;
                        }
                    case 4:
                        {
                        if(mod==4 && N!=4)
                         ans=N+5;
                        else
                         ans=9;
                        System.out.println(ans+ " AS");
                        break;
                        }
                    case 5:
                        {
                        if(mod==5 && N!=5)
                         ans=N+3;
                        else
                         ans=8;
                        System.out.println(ans+ " MS");
                        break;
                        }
                    case 6:
                        {
                        if(mod==6 && N!=6)
                         ans=N+1;
                        else
                         ans=7;
                        System.out.println(ans+" WS");
                        break;
                        }
                    case 7:
                        {
                        if(mod==7 && N!=7)
                         ans=N-1;
                        else
                         ans=6;
                        System.out.println(ans+ " WS");
                        break;
                        }
                    case 8:
                        {
                        if(mod==8 && N!=8)
                         ans=N-3;
                        else
                         ans=5;
                        System.out.println(ans+ " MS");
                        break;
                        }
                    case 9:
                        {
                         if(mod==9 && N!=9)
                         ans=N-5;
                        else
                         ans=4;
                        System.out.println(ans+ " AS");
                        break;

                        }
                    case 10:
                        {
                        if(mod==10 && N!=10)
                         ans=N-7;
                        else
                         ans=3;
                        System.out.println(ans+ " AS");
                        break;
                        }
                    case 11:
                        {
                        if(mod==11 && N!=11)
                         ans=N-9;
                        else
                         ans=2;
                        System.out.println(ans+ " MS");
                        break;
                        }
                    case 0:
                        {
                        if(mod==0 && N!=12)
                         ans=N-11;
                        else
                         ans=1;
                        System.out.println(ans+ " WS");
                        break;
                        }

                }
            }

        }
    }
