package Arrays;

public class Sum_Of_Arrays {
    public static void main(String[] args) {
        int[] numbers ={20,40,50};
        int sum =0;
        for (int i =0;i< numbers.length;i++){
            sum = sum + numbers[i];
        }
        System.out.println(sum);
    }
}
