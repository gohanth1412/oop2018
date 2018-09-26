package week2.task2;
public class Fraction {


    public static int gcd(int a, int b) {
        // TODO: Tính u?c chung l?n nh?t c?a 2 s? a, b
        int c = 0;
        for(int i=1;i<=a || i<= b;i++)
        {
            if(a%i == 0 && b%i==0)
                c=i;
        }
        return c;
    }

    // TODO: khai báo các thu?c tính

    public int numerator;
    public int denominator;
    Fraction()
    {
    }
    public Fraction(int numerator, int denominator) {
        // TODO: kh?i t?o giá tr? cho các thu?c tính numberator (t? s?), denominator (m?u s?)
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction add(Fraction other) {
        // TODO: Phuong th?c c?ng hai phân s? (this và other), tr? v? d?i tu?ng Fraction m?i
        Fraction a = new Fraction();
        a.numerator = this.numerator*other.denominator + this.denominator*other.numerator;
        a.denominator = this.denominator*other.denominator;
        int b=gcd(a.numerator,a.denominator);
        a.numerator /= b ;
        a.denominator /= b;
        return a;
    }

    public Fraction subtract(Fraction other) {
        // TODO: Phuong th?c tr? hai phân s? (this và other), tr? v? d?i tu?ng Fraction m?i
        Fraction c = new Fraction();
        c.numerator = this.numerator*other.denominator - this.denominator*other.numerator;
        c.denominator = this.denominator*other.denominator;
        int b=gcd(c.numerator,c.denominator);
        c.numerator /= b ;
        c.denominator /= b;
        return c;
    }

    public Fraction multiply(Fraction other) {
        // TODO: Phuong th?c nhân hai phân s? (this và other), tr? v? d?i tu?ng Fraction m?i
        Fraction d = new Fraction();
        d.numerator = this.numerator*other.numerator;
        d.denominator = this.denominator*other.denominator;
        int b=gcd(d.numerator,d.denominator);
        d.numerator /= b ;
        d.denominator /= b;
        return d;
    }

    public Fraction divide(Fraction other) {
        // TODO: Phuong th?c chia hai phân s? (this và other), tr? v? d?i tu?ng Fraction m?i
        Fraction e = new Fraction();
        e.numerator = this.numerator*other.denominator;
        e.denominator = this.denominator*other.numerator;
        int b=gcd(e.numerator,e.denominator);
        e.numerator /= b ;
        e.denominator /= b;
        return e;
    }
}