package Interview_question;

public class Second_Highest_In_Array
{
    public static void main(String[] args) {
        int[] numbers={12,45,44,67,98};
        int highest=0;
        int secondHighest=0;
        for (int n : numbers)
        {
            if (n>highest){
                secondHighest=highest;
                 highest=n;
            } else if (n>secondHighest && n!=highest) {
                secondHighest=n;
            }
        }
        System.out.println(secondHighest);
        System.out.println(highest);
    }
}
