package Main;

public class Apple extends Fruit {
    private Float fruitWeight;

    public Apple(Float fruitWeight) {
        super( fruitWeight );
    }

    @Override
    public Float getFruitWeight() {
        return super.getFruitWeight();
    }

    @Override
    public void setFruitWeight(Float fruitWeight) {
        super.setFruitWeight( fruitWeight );
    }
}
