import java.util.Scanner;

public class palindrome{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int dig=0,rev=0;
        int original;
        original=num;
        while(num!=0){
            dig=num%10;
            rev=rev*10+dig;
            num=num/10;
        }

        if(rev==original)
            System.out.println("Palindrome number");
        else
            System.out.println("Not Palindrome!");
        
    }

}