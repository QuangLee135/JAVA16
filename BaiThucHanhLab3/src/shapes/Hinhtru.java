package shapes;

import java.util.Scanner;

public class Hinhtru extends Hinhtron {
    public float chieuCao;

    public Hinhtru(){
        ten = "Hinh Tru";
    }

    public void nhapchieucao(){
        nhapBanKinh();

        System.out.println("Chieu Cao = ");
        try (Scanner sc = new Scanner(System.in)) {
            chieuCao = sc.nextFloat();
        }
    }
    public void tinhTheTich(){
        tinhDienTich();
        tt = dt * chieuCao;
    }
}