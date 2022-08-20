import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task1 {
    /* 1. Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа) */
    public static void main(String[] args) {
        ArrayList<String> arr1 = new ArrayList<>(Arrays.asList("Яблоко", "Груша", "Молоко"));
        ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(arr1);
        System.out.println(arr2);
        System.out.println(swap(arr1, 0, 1));
        System.out.println(swap(arr2, 0, 5));


    }
    public static <T> ArrayList<T> swap (ArrayList <T> arr, int firstIndex, int secondIndex){
        if (firstIndex >=0 & secondIndex < arr.size()){
            Collections.swap(arr, firstIndex, secondIndex);
        } else throw new ArrayIndexOutOfBoundsException("Index out of bounds");
        return arr;
    }
}
