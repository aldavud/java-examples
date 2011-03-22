public class Singleton {

    static int counter = 0;
    static private Singleton instance = null;

    private Singleton() {
        Singleton.counter++;
    }

    public static Singleton getInstance() {
        if (Singleton.instance == null) {
           Singleton.instance = new Singleton(); 
        }
        return Singleton.instance;
    }

    public static void main(String... args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();
        System.out.println(Singleton.counter);
    }

}
