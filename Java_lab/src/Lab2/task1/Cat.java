package Lab2.task1;

public class Cat extends Animal {
    private final boolean CatchMice;

    Cat(final String name, final int age,final boolean CatchMice) {
        super(name, age);
        this.CatchMice = CatchMice;
    }
    boolean getCatchMice(){
        return CatchMice;
    }

    @Override
    public String toString() {
        return "Cat{" +" Name "+getName()+" Age "+getAge()+" years"+" Catch Mice "+getCatchMice()+"}";
    }

    static {
        System.out.println("New Cat");
    }

        void makeSound() {
            System.out.println("Meow");
        }




}