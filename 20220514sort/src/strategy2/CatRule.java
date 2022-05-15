package strategy2;

import java.util.Comparator;

/**
 * @author : ldy
 * @version : 1.0
 */
public class CatRule implements Comparator<Cat> {
    @Override
    public int compare(Cat o1, Cat o2) {
        if (o1.getAge()>o2.getAge()){return 1;}
        if (o1.getAge()<o2.getAge()){return 2;}
        else {return 0;}
    }
}
