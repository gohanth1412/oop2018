package week2.task2;
public class Fraction {


    public static int gcd(int a, int b) {
        // TODO: Tính ước chung lớn nhất của 2 số a, b
        int c = 0;
        for(int i=1;i<=a || i<= b;i++)
        {
            if(a%i == 0 && b%i==0)
                c=i;
        }
        return c;
    }

    // TODO: khai báo các thuộc tính

    public int numerator;
    public int denominator;
    Fraction()
    {
    }
    public Fraction(int numerator, int denominator) {
        // TODO: khởi tạo giá trị cho các thuộc tính numberator (tử số), denominator (mẫu số)
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction add(Fraction other) {
        // TODO: Phuong thức cộng hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction a = new Fraction();
        a.numerator = this.numerator*other.denominator + this.denominator*other.numerator;
        a.denominator = this.denominator*other.denominator;
        int b=gcd(a.numerator,a.denominator);
        a.numerator /= b ;
        a.denominator /= b;
        return a;
    }

    public Fraction subtract(Fraction other) {
        // TODO: Phuong thức trừ hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction c = new Fraction();
        c.numerator = this.numerator*other.denominator - this.denominator*other.numerator;
        c.denominator = this.denominator*other.denominator;
        int b=gcd(c.numerator,c.denominator);
        c.numerator /= b ;
        c.denominator /= b;
        return c;
    }

    public Fraction multiply(Fraction other) {
        // TODO: Phuong thức nhân hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction d = new Fraction();
        d.numerator = this.numerator*other.numerator;
        d.denominator = this.denominator*other.denominator;
        int b=gcd(d.numerator,d.denominator);
        d.numerator /= b ;
        d.denominator /= b;
        return d;
    }

    public Fraction divide(Fraction other) {
        // TODO: Phuong thức chia hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction e = new Fraction();
        e.numerator = this.numerator*other.denominator;
        e.denominator = this.denominator*other.numerator;
        int b=gcd(e.numerator,e.denominator);
        e.numerator /= b ;
        e.denominator /= b;
        return e;
    }
}