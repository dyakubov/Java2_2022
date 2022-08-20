import java.util.ArrayList;
import java.util.Arrays;

public class Task2 {
    /*2. Написать метод, который преобразует массив в ArrayList; */
    public static void main(String[] args) {
        Integer[] numbers = new Integer[]{1, 2, 3, 4, 5};
        String[] fruits = new String[]{"apple", "orange", "Strawberry"};
        System.out.println(arrToList(numbers));
        System.out.println(arrToList(fruits));


    }
    public static <T> ArrayList <T> arrToList (T[] arr){
        return new ArrayList<>(Arrays.asList(arr));
    }
}
