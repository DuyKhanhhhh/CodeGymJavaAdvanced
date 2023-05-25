package TH_AnimalAndCat;

public class Test {
    public static void main(String[] args) {
        Animal [] animals = new Animal[1];
        animals [0] = new Cat();
        for (Animal a: animals) {
            System.out.println(a.makeSound());

            if (a instanceof Cat){
                Edible edible = (Cat) a;
                System.out.println(edible.howtoEat());
            }
        }
    }
}
