package Lab2.task1;

public abstract  class Animal {
    private final String name;
    private final int age;

    Animal(final String name,final int age){
        this.name=name;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    void makeSound(){

    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}









