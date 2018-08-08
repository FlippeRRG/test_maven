package Main;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] str = {"123", "456", "789", "111"};
        swap( 0, 2, str );
        System.out.println(str[0]);

        Apple apple1 = new Apple( 2.5f );
        Apple apple2 = new Apple( 3.5f );
        Apple apple3 = new Apple( 4.5f );

        Orange orange1 = new Orange( 1.5f );
        Orange orange2 = new Orange( 2.0f );
        Orange orange3 = new Orange( 3.0f );

        Box<Fruit> box = new Box<Fruit>( apple1 );
        Box<Fruit> box1 = new Box<Fruit>( orange1 );
        box1.addFruit( orange2 ); // Добавление фрукта в коробку
        box1.addFruit( orange3 );
        box1.print(); // Метод печати для проверки содержимого коробки
        box.addFruit( apple2 );
        box.addFruit( apple3 );
        box.print();
        System.out.println(box.addFruit( orange1 )); // Попытка положить апельсин в коробку с яблоками
        System.out.println(box.getWeight());
        System.out.println(box1.getWeight());
        System.out.println(box.compare( box1 ));
        box.dropFruits( box1 );
        box.print();
        box1.print();

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


