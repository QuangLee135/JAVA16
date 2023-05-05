<<<<<<< HEAD
package shapes;

import java.util.Scanner;

public class HinhChuNhat extends HinhHoc {
    public float dai;
    public float rong;
    public HinhChuNhat()
    {
        ten = "Hinh Chu Nhat";
    }
    public void nhapchieudai()
    {
        System.out.println("Chieu dai = ");
        try (Scanner sc = new Scanner(System.in)) {
            dai = sc.nextFloat();
        }
    }
    public void nhapchieurong()
    {
        System.out.println("Chieu rong = ");
        try (Scanner sc = new Scanner(System.in)) {
            rong = sc.nextFloat();
        }
    }
    public void tinhchuvi()
    {
        chuvi = 2 * ( dai + rong);
    }
    public void tinhdientich()
    {
        dientich = dai * rong;
    }
=======
package shapes;

import java.util.Scanner;

public class HinhChuNhat extends HinhHoc {
    public float dai;
    public float rong;
    public HinhChuNhat()
    {
        ten = "Hinh Chu Nhat";
    }
    public void nhapchieudai()
    {
        System.out.println("Chieu dai = ");
        try (Scanner sc = new Scanner(System.in)) {
            dai = sc.nextFloat();
        }
    }
    public void nhapchieurong()
    {
        System.out.println("Chieu rong = ");
        try (Scanner sc = new Scanner(System.in)) {
            rong = sc.nextFloat();
        }
    }
    public void tinhchuvi()
    {
        chuvi = 2 * ( dai + rong);
    }
    public void tinhdientich()
    {
        dientich = dai * rong;
    }
>>>>>>> aaed4a49acfd0850ac44ac87787ee402c7300c60
}