package Arrays;

import java.util.Arrays;

public class Array_Min_Max_Number {
    public static void main(String[] args) {
        int[] array={10,20,55,45,85,65,25};

//        Arrays.sort(array);
//        System.out.println(array[array.length-1]);

        int max=array[0];
        for (int i=0; i<array.length;i++)
        {
            if (array[i]>max)
                max=array[i];
        }
        System.out.println("maximum number in the array is -> " + max);

        int min=array[0];
        for (int i=0; i<array.length; i++)
        {
            if (array[i]<min)
                min=array[i];
        }
        System.out.println("minimum number in the array is -> "+min);
    }
}
