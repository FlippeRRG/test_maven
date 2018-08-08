package Main;

import java.util.ArrayList;
import java.util.Arrays;

public class Box<T extends Fruit> {

    private ArrayList<T> fruitBox = new ArrayList<>(  );

    public Box(T fruit) {
        fruitBox.add( fruit );
    }

    public Box(T...fruit){
       fruitBox = new ArrayList<>( Arrays.asList( fruit ) );
       for(T fr : fruitBox){
           if (!fruitBox.get( 0 ).getClass().equals( fr.getClass() )){
               fruitBox.remove( fr );
           }
       }
    }

    public boolean addFruit(Fruit fruit){
        if (fruit.getClass().equals( fruitBox.get( 0 ).getClass() )){
            fruitBox.add( (T)fruit );
            return true;
        } else {
            return false;
        }
    }

    public Float getWeight(){

        if (fruitBox.isEmpty()) return 0.0f;

        Float weight = 0.0f;
        for (T fruit : fruitBox ) {
            weight += fruit.getFruitWeight();
        }
        return weight;
    }

    public boolean compare (Box<T> box){
        Float thisWeight = this.getWeight();
        Float boxWeight = box.getWeight();
        if (thisWeight.equals( boxWeight )) return true;
        return false;
    }

    public void dropFruits (Box<T> box){
        if (this.fruitBox.get( 0 ).getClass().equals( box.fruitBox.get( 0 ).getClass() )){
            box.fruitBox.addAll( this.fruitBox );
        } else {
            box.fruitBox.clear();
            box.fruitBox.addAll( this.fruitBox );
            this.fruitBox.clear();
        }
    }
    public void print(){
        if (fruitBox.isEmpty()) {
            System.out.println("Коробка пуста");
        }
        for (T fruit : fruitBox) {
            System.out.print(fruit.getFruitWeight() + " ");
        }
        System.out.println();
    }
}
