import java.util.Scanner;

public class armstrong {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        //371 = 3^3 + 7^3 + 1^3 = 27+ 343+1 = 371
        //71 = 7^2 + 1^2= 49+1=50
        int n=sc.nextInt();
        int x=sc.nextInt();
        int original=n;
        int dig=0,sum=1,add=0;
        while(n!=0)
        {
            dig=n%10;
            for(int i=1;i<=x;i++){
                sum*=dig;
            }
            add+=sum;
            sum=1;
            n=n/10;
        }

        System.out.println(add);
        if(original==add)
            System.out.println("Armstrong number");
        else
            System.out.println("Not Armstrong");
    }    
}
