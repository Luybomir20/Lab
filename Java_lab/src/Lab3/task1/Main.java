package Lab3.task1;

public class Main {

    public static void main(final String [] args) {
         try {
            final User user1 = new User("Luybomir", "Martsimiuk", "mluybomir17@gmail.com", "0931261690",
                    new Address("Sheptitskogo", 15));
            System.out.println(user1);
        }catch (final UncheckedException e){
            System.out.println(e.getMessage()+" "+e.getCodeHTTP());
        }

    }

}




