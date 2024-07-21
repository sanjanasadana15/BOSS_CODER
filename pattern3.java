import java.util.Scanner;

class pattern3{
    public static void main(String[] args) {
        Scanner val= new Scanner(System.in);
        /* if N=5
            * * * * *
            * * * * *
            * * * * *
            * * * * * 
            * * * * *  
         */
        int n=val.nextInt();

        for(int i=0;i<n;i++){

            for(int j=0;j<n;j++)
                System.out.print("* ");
            System.out.println();
        }
    }
}