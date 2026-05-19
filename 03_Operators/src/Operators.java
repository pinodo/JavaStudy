public class Operators {
    public static void main(String[] args) throws Exception {
        int a = 5;
        int b = 2;
        int zero = 0;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        // System.out.println(a / zero); // This will throw an ArithmeticException: / by zero
        System.out.println(a % b);

        int c = 10;
        System.out.println(c++);
        System.out.println(++c);

        int d = 10;
        System.out.println(d);
        d += 10;
        System.out.println(d);
        d -= 10;
        System.out.println(d);
        d *= 10;
        System.out.println(d);
        d /= 10;
        System.out.println(d);
        d %= 10;
        System.out.println(d);

        int e = 10;
        int f = 20;
        System.out.println(e > f);
        System.out.println(e >= f);
        System.out.println(e < f);
        System.out.println(e <= f);
        System.out.println(e == f);
        System.out.println(e != f);

        int g = 10;
        int h = 20;
        System.out.println(g > 0 && h > 0);
        System.out.println(g > 0 || h > 0);
        System.out.println(!(g > 0));

        System.out.println(11 & 1);
    }
}
