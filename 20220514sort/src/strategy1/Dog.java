package strategy1;

/**
 * @author : ldy
 * @version : 1.0
 */
public class Dog implements Comparable<Dog> {
     int weight;
     int height;

    public Dog(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }
    @Override
    public int compareTo(Dog d) {
        if (this.weight>d.weight){return 1;}
        if (this.weight<d.weight){return -1;}
        else {return 0;}
    }

    @Override
    public String toString() {
        return "strategy1.Dog{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }
}
