import java.util.*;
class Dfirst{
    public static void main(String[] args){

        System.out.println("1-D Dynamic Array Programing");
        List<Integer> lst = new ArrayList<>();

        lst.add(8);
        lst.add(1);
        lst.add(2);
        lst.add(3);

       System.out.println(lst);

       System.out.println(lst.get(1));

       lst.set(2,1000);
       System.out.println(lst);
    }
}