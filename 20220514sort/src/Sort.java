import java.util.Comparator;

/**
 * @author : ldy
 * @version : 1.0
 */
public class Sort{

    public static void sort(Comparable[] arr){
        int min = 0;
        for (int j = 0; j < arr.length; j++) {
            for (int i = j; i < arr.length; i++) {
                min = arr[i].compareTo(arr[min]) == 1 ? min : i;
            }
            swap(arr,j,min);
            min=j+1;
        }
    }
    public static void swap(Comparable[] arr,int j,int min){
        Comparable temp = arr[j];
        arr[j] = arr[min];
        arr[min] = temp;
    }
}
