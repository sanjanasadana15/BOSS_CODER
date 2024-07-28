import java.util.*;

class Input1DArray{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> lst= new ArrayList<>();
        int x;
        for(int i=0;i<n;i++){
            x=sc.nextInt();
            lst.add(x);

        }   

        System.out.println(lst);
    }
}