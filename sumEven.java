import java.util.Scanner;

public class sumEven{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();
        int sum=0,count=0;
        /*for(int i=2;i<num*num*num;i=i+2)
        {
            if(i%2==0)
            {
                sum=sum+i;
                count++;
            }
            if(count == num)
                break;
        }*/
        sum=num*(num+1);
        System.out.println(sum);
    }
}