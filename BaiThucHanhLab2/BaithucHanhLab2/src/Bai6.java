import java.util.Scanner;

public class Bai6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap vao so 1 so nguyen duong");
		int n = sc.nextInt();
        
        int gt = 1;
        int i = 1;
        do {
            gt *= i;
            i++;
        } while (i <= n);
        
        System.out.println("Giai thua cua " + n + " la " + gt);
        sc.close();
    }

}