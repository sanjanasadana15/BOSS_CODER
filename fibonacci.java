import java.util.Scanner;

class fibonacci{
    public static void main(String[] args){

        //Fibonnacci of 5 is 0,1,1,2,3,5
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        if(n>0)30
            System.out.print("0 ");
        if(n>1)
            System.out.print("1 ");
        
        int prev =1, pprev=0;
        for (int i=3; i<=n;i++)
        {
            int current=pprev+prev;
            System.out.print(current+" ");
            pprev=prev;
            prev=current;


        }

    }
}