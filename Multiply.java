public class Multiply {

    public int divide7(int n) {
        int r = 0;
        int i = 0;
        while ((7<<(i+1)) <= n) {
            i++;
        }
        while (i >= 0) {
            if ((7<<i) <= n) {
                r += 1<<i;
            } else {
                r += 0<<i;
            }
            n = (n + (~(7<<i)) + 1);
            i--;
        }
        return r;
    }

    public int divide8(int n) {
        return n>>3;
    }

    public int multiply8(int n) {
        return n<<3;
    }

    public int multiply7(int n) {
        return n + (n<<1) + (n<<2);
    }

    public int add(int a, int b) {
        
    }

    public static void main(String... args) {
        Multiply m = new Multiply();
        System.out.println(m.multiply8(3) == 24);
        System.out.println(m.multiply8(5) == 40);
        System.out.println(m.multiply8(7) == 56);
        System.out.println(m.multiply8(28) == 224);
        System.out.println(m.multiply7(3) == 21);
        System.out.println(m.multiply7(5) == 35);
        System.out.println(m.multiply7(7) == 49);
        System.out.println(m.multiply7(28) == 196);
        System.out.println(m.divide7(21) == 3);
        System.out.println(m.divide7(42) == 6);
        System.out.println(m.divide7(210) == 30);
        System.out.println(m.divide7(441) == 63);
    }

}
