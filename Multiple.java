import java.util.Scanner;
class Multiple{
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number to find the multiple of 5: ");
        int num=sc.nextInt();
        int j=0;
        int[] multi=new int[num];
     
        for(int i=5;i<=num;i++)
        {
            if(i%5 ==0)
            {
                multi[j]=i;
                j++;

            }
                
        }  
        System.out.println("j="+j);
        for(int i=0;i< j ;i++){
            System.out.print(multi[i]+ " ");
        }
        System.out.println();

    }
}