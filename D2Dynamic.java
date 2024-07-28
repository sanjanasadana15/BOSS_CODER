import java.util.*;

class D2Dynamic{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int r=sc.nextInt();
        int c=sc.nextInt();

        List<List<Integer>> mat = new ArrayList<>();
        int x;
        for(int i=0;i<r;i++){
            List<Integer> arr = new ArrayList<>();
            for(int j=0;j<c;j++){
                x=sc.nextInt();
                arr.add(x);
            }
            mat.add(arr);
        }

        System.out.println(mat);

        System.out.println(mat.get(1).get(2));
        mat.get(1).set(2,1000);
        System.out.println("After update: " + mat.get(1).get(2));
        System.out.println(mat);
    }
}