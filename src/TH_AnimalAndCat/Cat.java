package TH_AnimalAndCat;

public class Cat extends Animal implements Edible{
    @Override
    public String makeSound(){
       return  "Cat: Gâu gauuuuu";
    }
    @Override
    public String howtoEat(){
        return "Ăn được";
    }
}
