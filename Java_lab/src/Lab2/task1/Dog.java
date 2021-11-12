package Lab2.task1;

public class Dog extends  Animal{
    private final boolean ProtectsTheTerritory;

    Dog(final String name,final int age,final boolean ProtectsTheTerritory){
        super(name,age);
        this.ProtectsTheTerritory=ProtectsTheTerritory;
    }
    static {
        System.out.println("New Dog");
    }
    boolean getProtectsTheTerritory()
    {
        return  ProtectsTheTerritory;
    }



    @Override
    void makeSound() {
        System.out.println("Bark");//Гавкання
    }

    @Override
    public String toString() {
        return "Dog{" +
                " Name "+getName()+" Age "+getAge()+" years "+"Protects the Territory "+getProtectsTheTerritory()+
                '}';
    }
}
