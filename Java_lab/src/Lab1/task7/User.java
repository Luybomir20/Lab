package Lab1.task7;

public class User {//Створюємо клас користувач
    private final String firstName;//Створюємо поля властиві класу
    private final String SurName;
    private final Integer age;
    private final String email;

    public User(final String firstName, final String SurName, final Integer age, final String email) {//Створюємо метод і додаємо параметри
        this.firstName = firstName;//Cтворюємо посилання на об`єкт
        this.SurName = SurName;
        this.age = age;
        this.email = email;
    }
    @Override//Перевизначення
    public boolean equals(final Object obj) {//Іквалс
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final User other = (User) obj;
        if (firstName == null && other.firstName != null){
            return false;

        } else return firstName.equals(other.firstName);
    }
    //Якщо вводимо однакові імена,то повертає true
    //Різні-false

    @Override//Перевизначення
    public int hashCode() {//Хеш код
        final int prime = 10;
        int result = -1;
        result = prime * result
                + ((age == null) ? 0 : age.hashCode());
        return result;
    }

    public static void main(final String[] args) {
        final User user1 = new User ("Luybomir","Matrsiniuk",20,"mluybomir17@gmail.com");
        final User user2 = new User ("Volodimir","Karpov",20,"Volodimir24@gmail.com");
        System.out.println (user1.equals (user2));//Порівнення
        System.out.println (user2.hashCode ());
    }


};

