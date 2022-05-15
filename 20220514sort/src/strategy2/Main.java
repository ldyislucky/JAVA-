package strategy2;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author : ldy
 * @version : 1.0
 */
public class Main {
    public static void main(String[] args) {
        Dog[] arr = {new Dog(3,3),new Dog(6,6),
                new Dog(4,4),new Dog(3,3)};
        Sort<Dog> dogSort = new Sort<>();
        dogSort.sort(arr,new DogRule());
        System.out.println(Arrays.toString(arr));
        Cat[] cats = {new Cat(5),new Cat(9),new Cat(3),new Cat(2)};
        Sort<Cat> catSort = new Sort<>();
        catSort.sort(cats,new CatRule());
        System.out.println(Arrays.toString(cats));
    }
}
