public class Threadexample implements Runnable {

    private String name;
    private int counter;

    public Threadexample() {
        this("none");
    }

    public Threadexample(String name) {
        this.name = name;
        this.counter = 0;
    }

    public void run() {
        System.out.println(this.name + " " + this.counter++);
    }


    public static void main(String... args) {
        Threadexample t1 = new Threadexample();
        Threadexample t2 = new Threadexample();
        new Thread(t1).start();
        new Thread(t2).start();
    }

}
