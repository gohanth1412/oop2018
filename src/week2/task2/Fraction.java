package week2.task2;


public class Fraction {


    public static int gcd(int a, int b) {
        // TODO: Tính ước chung lớn nhất của 2 số a, b

        while (a!=b){
            if (a>b) a= a-b;
            else b= b-a;
        }
        return a;
    }

    // TODO: khai báo các thuộc tính

    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        // TODO: khởi tạo giá trị cho các thuộc tính numberator (tử số), denominator (mẫu số)
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction add(Fraction other) {
        // TODO: Phuong thức cộng hai phân số (this và other), trả về đối tượng Fraction mới
        int numerator = this.numerator*other.denominator + this.denominator*other.numerator;
        int denominator = this.denominator*other.denominator;
        Fraction a = new Fraction(numerator,denominator);
        int b=gcd(a.numerator,a.denominator);
        a.numerator /= b ;
        a.denominator /= b;
        return a;
    }

    public Fraction subtract(Fraction other) {
        // TODO: Phuong thức trừ hai phân số (this và other), trả về đối tượng Fraction mới

        int numerator = this.numerator*other.denominator - this.denominator*other.numerator;
        int denominator = this.denominator*other.denominator;
        Fraction c = new Fraction(numerator,denominator);
        int b=gcd(c.numerator,c.denominator);
        c.numerator /= b ;
        c.denominator /= b;
        return c;
    }

    public Fraction multiply(Fraction other) {
        // TODO: Phuong thức nhân hai phân số (this và other), trả về đối tượng Fraction mới
        int numerator = this.numerator*other.numerator;
        int denominator = this.denominator*other.denominator;
        Fraction d = new Fraction(numerator,denominator);
        int b=gcd(d.numerator,d.denominator);
        d.numerator /= b ;
        d.denominator /= b;
        return d;
    }

    public Fraction divide(Fraction other) {
        // TODO: Phuong thức chia hai phân số (this và other), trả về đối tượng Fraction mới
        int numerator = this.numerator*other.denominator;
        int denominator = this.denominator*other.numerator;
        Fraction e = new Fraction(numerator,denominator);
        int b=gcd(e.numerator,e.denominator);
        e.numerator /= b ;
        e.denominator /= b;
        return e;

    }

    public boolean equals(Object obj){
        Fraction fraction = (Fraction) obj;

        int tu =  this.numerator*fraction.denominator - this.denominator*fraction.numerator;
        int mau =  this.denominator*fraction.denominator;
        if (tu * mau >=0) return true;
        return false;
    }


}