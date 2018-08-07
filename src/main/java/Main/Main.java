package Main;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] str = {"123", "456", "789", "111"};
        swap( 0, 2, str );
        System.out.println(str[0]);
    }

    private static <T> T[] swap(int first, int second, T[] arr){
        if (arr.length==0) return null;
        T temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
        return arr;
    }




    public static <E> ArrayList<E> arrSwap(E[] arr){
        ArrayList<E> arrResult = new ArrayList<E>( Arrays.asList( arr ) );
        return arrResult;
    }
}


