import java.util.HashSet;
import java.util.Scanner;

public class Slide55 {
    public static void main(String[] args) {
        String name;
        HashSet<String> hashSet = new HashSet<>();
        try (Scanner sc = new Scanner(System.in)) {
            hashSet.add("Quang");
            hashSet.add("Nam");
            hashSet.add("Dung");
            hashSet.add("Anh");
            hashSet.add("Thanh");
            //hien thi cac phan tu trong hashSet
            System.out.println("Cac phan tu trong hashSet : ");
            System.out.println(hashSet);
            System.out.println("Nhap phan tu can xoa");
            name = sc.nextLine();
        }
        // neu phan tu can xoa  ton tai hashSet thi se thong bao xoa thanh cong
        // nguoc lai thong bao xoa khong thanh cong
        if(hashSet.contains(name)) {
            hashSet.remove(name);
            System.out.println("xoa thanh cong!");
            System.out.println("cac phan tu con lai trong hashSet: ");
            System.out.println(hashSet);
        } else {
            System.out.println("xoa khong thanh cong!");
        }
    }
}