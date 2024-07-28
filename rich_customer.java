import java.util.*;

class RichCustomer {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int x;
        List<List<Integer>> mat = new ArrayList<>();
        
        // Reading the matrix
        for(int i = 0; i < r; i++){
            List<Integer> arr = new ArrayList<>();
            for(int j = 0; j < c; j++){
                x = sc.nextInt();
                arr.add(x);
            }
            mat.add(arr);
        }
        
        // Printing the matrix
        System.out.println("Matrix: " + mat);

        // Array to store sum of each row
        int[] sum = new int[r];
        
        // Calculating the sum of each row
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                sum[i] += mat.get(i).get(j);
            }
        }
        
        // Printing the sum array
        System.out.println("Sum of each row:");
        for(int i = 0; i < r; i++) {
            System.out.println("Sum of row " + (i + 1) + ": " + sum[i]);

        }
        int rich =sum[0];
        for(int i=1;i<r;i++){
            if(sum[i]> rich)
                rich =sum[i];
        }

        System.out.println("Richest customer:="+rich);
    }
}
