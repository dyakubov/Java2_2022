package Task3;

import java.util.ArrayList;
import java.util.Arrays;

public class Box <T extends Fruit> {
    private ArrayList<T> objects;
    public Box() {
        this.objects = new ArrayList<>();
    }

    @SafeVarargs
    public final void add(T...fruit) {
        objects.addAll(Arrays.asList(fruit));
    }

    public double getWeight(){
        double w = 0;
        for (T o : objects) {
            w += o.getFruitWeight();
        }
        return w;
    }

    public boolean compare (Box <? extends Fruit> box){
        return this.getWeight() == box.getWeight();
    }

    public void replace (Box<T> target){
        for (T o : objects) {
            target.add(o);
        }
        this.objects = new ArrayList<>();
    }
}
