package TH_AnimalAndInterface;

public class Test {
    public static void main(String[] args) {
        Animal [] animals = new Animal[2];
        animals [0] = new Tiger();
        animals [1] = new Chicken();
        for (Animal a :animals) {
            System.out.println(a.makeSound());
            if (a instanceof Chicken){
                Edible edible = (Chicken) a;
                System.out.println(edible.howtoEat());
            }
        }
        Fruit [] fruit = new Fruit[2];
        fruit [0] = new Apple();
        fruit [1] = new Orange();
        for (Fruit f: fruit) {
            System.out.println(f.howtoEat());
        }
    }
}
