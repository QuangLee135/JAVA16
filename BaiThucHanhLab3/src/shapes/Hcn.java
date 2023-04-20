package shapes;

import java.util.Scanner;

public class Hcn extends Hinhhoc {
    public float dai;
    public float rong;

    public Hcn(){
        ten = "Hinh Chu Nhat";
    }
    public void nhapChieuDai(){
        System.out.println("Chieu dai = ");
        try (Scanner sc = new Scanner(System.in)) {
            dai = sc.nextFloat();
        }
    }
    public void nhapChieuRong(){
        System.out.println("Chieu rong = ");
        try (Scanner sc = new Scanner(System.in)) {
            rong = sc.nextFloat();
        }
    }
    public void tinhChuVi(){
        cv = 2 * (dai + rong);
    }
    public void tinhDienTich(){
        dt = dai * rong;
    }
}