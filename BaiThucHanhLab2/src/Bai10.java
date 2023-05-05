import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap chuoi (khong qua 80 ky tu): ");
        String chuoi = sc.nextLine();

        System.out.print("Nhap ky tu can dem: ");
        char ch = sc.nextLine().charAt(0);

        int dem = 0;
        for (int i = 0; i < chuoi.length(); i++) {
            if (chuoi.charAt(i) == ch) {
                dem++;
            }
        }
        System.out.println("So lan xuat hien cua ky tu " + ch + " trong chuoi la: " + dem);
        sc.close();
    }
}