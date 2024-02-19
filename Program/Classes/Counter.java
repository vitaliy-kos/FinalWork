package Program.Classes;

public class Counter implements AutoCloseable {
    static int counter = 0;

    public int getCounter() {
        return counter;
    }

    public void add() {
        counter++;
    }

    @Override
    public void close() throws RuntimeException {
        throw new RuntimeException("Выполнен метод закрытия обьекта Counter.");
    }


}
