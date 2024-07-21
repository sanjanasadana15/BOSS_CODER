import java.util.Scanner;

class pattern6{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        /* if N=5
         1
         2 2
         3 3 3
         4 4 4 4
         5 5 5 5 5
         */
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i+1;j++){
                //j=i+0;
                System.out.print((i+1)+" ");
            }
            System.out.println();

        }

    }
}