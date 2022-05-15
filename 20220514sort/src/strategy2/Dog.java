package strategy2;

/**
 * @author : ldy
 * @version : 1.0
 */
public class Dog {
     int weight;
     int height;

    public Dog(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    @Override
    public String toString() {
        return "strategy1.Dog{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }
}
