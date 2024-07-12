import java.util.Scanner;

class positiveNumber{
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int arrSize=sc.nextInt();

        int[] a= new int[arrSize];
        int []b=new int[arrSize];
        
        for(int i=0; i<arrSize; i++){
            a[i]=sc.nextInt();
        }
        int j=0,subArr=0;
        for(int i=0;i<arrSize;i++)
        {
           if(a[i] > 0){

            b[j]=a[i];
            j++;
           }
           subArr=j;
        }
        for(int i=0; i< subArr ; i++){
            System.out.print(b[i]+" ");
        }
        System.out.println();
    }
}