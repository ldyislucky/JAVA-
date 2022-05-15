package strategy2;

import java.util.Comparator;

/**
 * @author : ldy
 * @version : 1.0
 */
public class Sort<T>{

    public void sort(T[] arr, Comparator comparator){
        int min = 0;
        for (int j = 0; j < arr.length; j++) {
            for (int i = j; i < arr.length; i++) {
                min = comparator.compare(arr[i],arr[min]) == 1 ? min : i;
            }
            swap(arr,j,min);
            min=j+1;
        }
    }
    public void swap(T[] arr,int j,int min){
        T temp = arr[j];
        arr[j] = arr[min];
        arr[min] = temp;
    }
}
