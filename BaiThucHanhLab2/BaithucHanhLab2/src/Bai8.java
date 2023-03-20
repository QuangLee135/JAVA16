import java.util.Scanner;
public class Bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao 1 day so");
        int n = sc.nextInt();
        int[] a = new int[n];
        int sum = 0;
        float tbc;

        for (int i = 0; i < n; i++) {
            System.out.print(" ");
            a[i] = sc.nextInt();
            sum += a[i];
        }
        tbc = (float)sum / n;
        System.out.println("Trung binh cong cua day la: " + tbc);
        sc.close();
    }
}      
    

