package BaiTap2104;
import java.util.Scanner;

public class KhaiBaoDanhBa {
    public static void main(String[] args) {
        TenTrongDanhBa danhBa = new TenTrongDanhBa();
        try (Scanner sc = new Scanner(System.in)) {
            boolean check = true;

     while(check==true) {
                System.out.println("=====MENU=====");
                System.out.println("1. Them moi contact");
                System.out.println("2. Cap nhat so đien thoai cua contact");
                System.out.println("3. Xoa contact");
                System.out.println("4. Tim kiem contact theo ten");
                System.out.println("0. Thoat chuong trinh");
                System.out.print("Moi quy khach chon: ");

                int choice = sc.nextInt();
                sc.nextLine(); 

                switch (choice) {
                    case 1:
                        System.out.print("Nhap ten: ");
                        String ten = sc.nextLine();
                        System.out.print("Nhap so đien thoai: ");
                        String soDienThoai = sc.nextLine();
                        danhBa.themMoi(ten, soDienThoai);
                        break;
                    case 2:
                        System.out.print("Nhap ten can nhap: ");
                        ten = sc.nextLine();
                        System.out.print("Nhap so dien thoai moi: ");
                        soDienThoai = sc.nextLine();
                        danhBa.capNhat(ten, soDienThoai);
                        break;
                    case 3:
                        System.out.print("Nhap ten can xoa: ");
                        ten = sc.nextLine();
                        danhBa.xoa(ten);
                        break;
                    case 4:
                        System.out.print("Nhap ten can tim kiem: ");
                        ten= sc.nextLine();
                        System.out.println(danhBa.timKiem(ten));
                    case 0 : check = false;
                    default : System.out.println("lua chon khong hop le! xin quy khach vui long thu lai");
                    
                    	
 }}
        }}}
                   