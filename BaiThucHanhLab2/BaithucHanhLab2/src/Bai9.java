import java.util.Scanner;

public class Bai9 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String chuoi;
		System.out.print("nhap vao chuoi\n");
		chuoi=sc.nextLine();
        char arr[] = chuoi.toCharArray();
		int inthuong=0;
		int inhoa=0;
		int inso=0;
		for(int i=0;i<chuoi.length();i++) {
		{
			char c = arr[i];
			if(Character.isUpperCase(c)) {
				inhoa++;
			}
			if(Character.isLowerCase(c)) {
				inthuong++;
			}
			if(Character.isDigit(c)) {
				inso++;
			}
		}
		System.out.println("chuỗi có "+inhoa+" chữ cái in hoa");
		System.out.println("chuỗi có "+inthuong+" chữ cái in thường");
		System.out.println("chuỗi có "+inso+" chữ số");
        sc.close();
	}

}
}