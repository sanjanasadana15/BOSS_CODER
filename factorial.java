import java.util.Scanner;

public class factorial{
    public static void main(String[] args){
        //5!= 5*4*3*2*1
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int fact=1;
        for(int i=1; i<=n; i++){
            fact*=i;
        }
        System.out.println(fact);
        
    }

}