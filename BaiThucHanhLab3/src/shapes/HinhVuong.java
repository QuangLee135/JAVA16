<<<<<<< HEAD
package shapes;

import java.util.Scanner;

public class HinhVuong extends HinhChuNhat{
    public HinhVuong()
    {
        ten = "Hinh vuong ";
    }
    public void nhapcanh()
    {
        System.out.println("Canh = ");
        try (Scanner sc = new Scanner(System.in)) {
            dai = rong = sc.nextFloat();
        }
    }
=======
package shapes;

import java.util.Scanner;

public class HinhVuong extends HinhChuNhat{
    public HinhVuong()
    {
        ten = "Hinh vuong ";
    }
    public void nhapcanh()
    {
        System.out.println("Canh = ");
        try (Scanner sc = new Scanner(System.in)) {
            dai = rong = sc.nextFloat();
        }
    }
>>>>>>> aaed4a49acfd0850ac44ac87787ee402c7300c60
}