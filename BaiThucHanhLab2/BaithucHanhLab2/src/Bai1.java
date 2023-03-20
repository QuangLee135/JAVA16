import java.util.Scanner;

public class Bai1 {
  
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            float a, b;
            System.out.println("Nhap 2 chu so so a va b: ");
            a = sc.nextFloat();
            b = sc.nextFloat();

            //1
            System.out.println("Tong a cong b = "+ (a + b));
            System.out.println("Hieu a tru b = " + (a - b));
            System.out.println("Tich a nhan b = " + (a / b));
            System.out.println("Thuong a chia b = "+ (a % b));
            //2
            System.out.println("So sanh 2 so a va b:");
            System.out.println("a lon hon B "+ (a > b));
            System.out.println("A be hon B "+ (a < b));
            System.out.println("A bang B "+ (a == b));
            sc.close();

    
    }

}