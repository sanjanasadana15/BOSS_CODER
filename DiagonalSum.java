import java.util.*;

public class DiagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Assuming a square matrix of size n x n
        List <List<Integer>> mat= new ArrayList<>();
        int x;
        for(int i=0;i<n;i++){
            List <Integer> arr= new ArrayList<>();
            for(int j=0; j<n;j++){
                x=sc.nextInt();
                arr.add(x);

            }
            mat.add(arr);
        }

        int sum=0;
        for(int i=0;i<n;i++){
            sum+=mat.get(i).get(i);

            if(i != n-1-i)
                sum+=mat.get(i).get(n-1-i);
        }


        System.out.println("Sum:"+sum);
    }
}
