package shapes;

import java.util.Scanner;

public class Hinhtron extends Hinhhoc{
    public float banKinh;

    public Hinhtron(){
        ten = "Hinh Tron";
    }

    public void nhapBanKinh(){
        System.out.println("Ban Kinh = ");
            try (Scanner sc = new Scanner(System.in)) {
                banKinh = sc.nextFloat();
            }
        }
        
    public void tinhChuVi(){
        cv = 2 * PI * banKinh;
    }
    public void tinhDienTich(){
        dt = PI * banKinh * banKinh;
    }
}