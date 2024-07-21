
import java.util.Scanner;
class pattern5{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int n=sc.nextInt();
        /* if N=4
         1
         1 2
         1 2 3 4
         */
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<=i+1;j++)
                System.out.print(j+" ");
            System.out.println();
        }

    }
}