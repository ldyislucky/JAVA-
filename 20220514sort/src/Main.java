import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author : ldy
 * @version : 1.0
 */
public class Main {
    public static void main(String[] args) {
        Comparable[] arr = {new Dog(3,3),new Dog(6,6),
                new Dog(4,4),new Dog(3,3)};
        Sort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
