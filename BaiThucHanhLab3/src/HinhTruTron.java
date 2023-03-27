import java.util.Scanner;

public class HinhTruTron {
    //khai bao thuoc tinh
    public float bk;
    public float cv;
    public float dt;
    public float cc;
    public float tt;
    final float Pi = 3.14f;
    Scanner sc = new Scanner(System.in);
    //khai bao phuong thuc
    public void tinhbankinh()
    {
        System.out.println("Nhap ban kinh");
        bk = sc.nextFloat();        
    }
    public void tinhcchieucao()
    {
        System.out.print("Nhap chieu cao: ");
        cc = sc.nextInt();
    }
    public void tinhchuvi()
    {
        cv = 2 * bk * Pi;
    }
    public void tinhdientich()
    {
        dt = 2 * Pi * bk * cc;
    }
    public void thetich()
    {
        tt = Pi  * bk * bk * cc;
    }
    public void phuongthuchienthihinhtrutron()
    {
        System.out.println("Chu vi hinh tru tron =" + cv);
        System.out.println("Dien tich hinh tru tron =" + dt);
        System.out.println("The tich hinh tru tron =" + tt);
    }
}