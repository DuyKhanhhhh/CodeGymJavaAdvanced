package TH_AnimalAndInterface;

public class Chicken extends Animal implements Edible{
    @Override
    public String makeSound(){
        return "Chicken: Éc Éc";
    }
    @Override
    public String howtoEat(){
        return "Cục cục";
    }
}
