package week2.task1;

public class Task1 {

    public static int gcd(int a, int b) {
        if (a==0) return b;
        return gcd(b%a,a);
    }

    public static int fibonacci(int n) {
        if (n == 0) return 0;
        else if (n == 1) return 1;
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args) {
        System.out.println("Tim UCLN của 15 và 25");
        System.out.println(gcd(15,25));

        System.out.println("Vị trí Fibonacci của 5");
        System.out.println(fibonacci(5));
    }
}