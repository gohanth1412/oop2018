package week2.task3;

public class Task3 {


}

//TODO: khai báo 3 class t??ng ?ng v?i 3 ??i t??ng th?c t? ? d??i
class giaovien{
    // 3 thuoc tinh cua doi tuong
    private int tuoi;
    private String name;
    private String md;
    // cac phuong thuc setter,getter
    public void setTuoi(int n)
    {
        tuoi=n;
    }
    public void setName(String n)
    {
        name = n;
    }
    public void setMd(String n)
    {
        md=n;
    }
    public int getTuoi()
    {
        return tuoi;
    }
    public String getName()
    {
        return name;
    }
    public String getMd()
    {
        return md;
    }
    //1.phuong thuc in ra ten,tuoi va mon day cua giao vien
    void getInfo()
    {
        System.out.println("Ten giao vien la :"+ name + "tuoi: "+ tuoi+"Mon day: "+md );
    }
    //2.phuong thuc so sanh xem 2 giao vien co day cung mot mon hoc khong
    public boolean sameSubjects(giaovien t1,giaovien t2)
    {
        String s1= t1.getMd();
        String s2 = t2.getMd();
        return t1.equals(t2);
    }
    //3.phuong thuc kiem tra xem giao vien do bao gio nghi huu
    public int ngh(giaovien t)
    {
        int a=0;
        if(t.getTuoi()>50)
            return -1;
        else if(t.getTuoi()<50){
            a=50-t.getTuoi();
            return a;
        }
        return 0;

    }

}
//doi tuong 2 la bac si

class doctor
{
    private int age;
    private String name;
    private String field;
    private int seniority;
    public void setAge(int n)
    {
        age=n;
    }
    public void setName(String n)
    {
        name = n;
    }
    public void setField(String n)
    {
        field=n;
    }
    public void setSeniority(int n)
    {
        seniority = n;
    }
    public int getAge()
    {
        return age;
    }
    public String getName()
    {
        return name;
    }
    public String getField()
    {
        return field;
    }
    public int getSeniority()
    {
        return seniority;
    }
    //1.phuong thuc in ra ten,tuoi,chuyen nganh,tham nien cua bac si
    void getInfo()
    {
        System.out.println("Bac si :"+ name + "tuoi: "+ age+"chuyen nganh: "+field+"tham nien" + seniority );
    }
    //    2.phuong thuc kiem tra xem cac bac si co cung chuen nganh khong
    public boolean sameField( doctor d1 ,doctor d2)
    {
        String t1=d1.field;
        String t2 =d2.field;
        return t1.equals(t2);
    }
    //    3.phuong thuc in ra so tien bac si kiem ra trong 1 thang
    public void money(doctor d)
    {
        if(d.getSeniority()<=5)
            System.out.println("So tien bac si kiem duoc trong 1 thang la 10 trieu");
        else if(d.getSeniority()>5&&d.getSeniority()<=10)
            System.out.println("So tien bac si kiem duoc trong 1 thang la 15 trieu");
        else
            System.out.println("So tien bac si kiem duoc trong 1 thang la 20 trieu");
    }
}
//doi tuong 3 la con cho
class dog{
    private int tuoi;
    private String mauda;
    private String gioitinh;
    public void settuoi(int n)
    {
        tuoi=n;
    }
    public void setMauda(String n)
    {
        mauda = n;
    }
    public void setGioitinh(String n){gioitinh=n;
    }
    public int gettuoi()
    {
        return tuoi;
    }
    public String getMauda()
    {
        return mauda;
    }
    public String getGioitinh()
    {
        return gioitinh;
    }
    void thongtin()
    {
        System.out.println("Mau da cho "+ mauda + ","+tuoi + "tuoi,la giong"+gioitinh);
    }
    dog(int age, String mauda ,String gioitinh)
    {
        tuoi = age;
        this.mauda = mauda;
        this.gioitinh = gioitinh;
    }
    public boolean ktgt(dog d1,dog d2)
    {
        String t = d1.gioitinh;
        String t1 = d2.gioitinh;
        return t.equals(t1);
    }



}
