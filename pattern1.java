class pattern1{
    public static void main(String[] args){

        /*  
            Week 1
            Day1 Day2 Day3 Day4 Day5 Day6 Day7
            Week 2
            Day1 Day2 Day3 Day4 Day5 Day6 Day7
            Week 3
            Day1 Day2 Day3 Day4 Day5 Day6 Day7
            Week 4
            Day1 Day2 Day3 Day4 Day5 Day6 Day7
         */
        int Week=4;
        int Days=7;
        
        for(int i=1;i<=Week;i++)
        {
            System.out.println("Week "+i);
            for(int j=1;j<=Days;j++)
                System.out.print("Day"+i+" ");
            System.out.println();
        }

    }

}