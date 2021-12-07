package Lab3.task2;

public class Main {
    public static void main(final String[] args) throws Exception {

        try (final Square square = new Square(2)) {
            System.out.println(square);

        } catch (final SquareException e) {
            System.out.println(e.getMessage());
        }


    }
}
