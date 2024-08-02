class palindromeString{
    public static void main(String[] args) {
        String s="abcba";
        int n=s.length();
        String rev="";

        for(int i=n-1; i>=0; i--){
            rev+=s.charAt(i);
        }

        System.out.println(rev);
        System.out.println(s);

        if( s.equals(rev))
            System.out.println("True");
        else    
            System.out.println("False");

        System.out.println("Equals:"+s.equals(rev));

    }
}