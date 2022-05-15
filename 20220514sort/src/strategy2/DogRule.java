package strategy2;

import java.util.Comparator;

/**
 * @author : ldy
 * @version : 1.0
 */
public class DogRule implements Comparator<Dog> {
    @Override
    public int compare(Dog o1, Dog o2) {
        if (o1.weight>o2.weight){return 1;}
        if (o1.weight<o2.weight){return -1;}
        else {return 0;}
    }
}
