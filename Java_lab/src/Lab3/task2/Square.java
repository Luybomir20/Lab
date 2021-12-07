package Lab3.task2;


public class Square implements AutoCloseable {
    private double side;

    public Square(final double side) {
        this.side = side;
        side();
    }

    void side() throws SquareException {
        if(side<=0){
            throw new SquareException("The number must be greater than 0");
        }
    }

    public double getSide() {
        return side;
    }



    public void setSide(final double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closed");
    }


}

