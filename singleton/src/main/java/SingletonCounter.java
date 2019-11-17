public class SingletonCounter {

    private static SingletonCounter singleton;

    private int number;

    private SingletonCounter() {
        number = 0;
    }

    public static SingletonCounter getInstance() {
        if(singleton == null) {
            singleton = new SingletonCounter();
        }
        return singleton;
    }

    public void IncrementCounter() {
        number++;
    }

    public void DecrementCounter() {
        number--;
    }

    public int getNumber() {
        return number;
    }
}
