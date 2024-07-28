import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class flipImage{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int x;
        List <List<Integer>> mat = new ArrayList<>();
        for(int i=0;i<r; i++){
            List<Integer> arr= new ArrayList<>();
            for(int j=0; j<c;j++){
                x=sc.nextInt();
                arr.add(x);
            }
            mat.add(arr);
        }
        /*Reverse logic */
        List <List<Integer>> mat2 = new ArrayList<>();
        for(int i=0;i<r;i++)
        {   
            List<Integer> arr2= new ArrayList<>();
            for(int j=c-1; j>=0; j--){
               
                arr2.add(mat.get(i).get(j));
            }
            mat2.add(arr2);
        }

        /*Reverse logic end */
        /* Flip logic */
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(mat2.get(i).get(j) == 0)
                    mat2.get(i).set(j,1);
                else 
                mat2.get(i).set(j,0);
            }
        }
        /*Flip Logic end */

        System.out.println(mat2);
    }
}