import java.util.*;
class anagram{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        int n1 = s1.length();
        int n2 = s2.length();
        int j=0;
        int[] count=new int[26];
        for(int i=0;i<n1; i++){
            char c=s1.charAt(i);
            count[c-'a']++;
        }
        for(int i=0;i<n2; i++){
            char c=s2.charAt(i);
            count[c-'a']--;
        }
        for(int i=0;i<26;i++){
            if( count[i] != 0)
                j++;
            
        }
        System.out.println("j="+j);
       if(j > 0)
        System.out.println("False");
    else   
        System.out.println("True");
           
    }
}