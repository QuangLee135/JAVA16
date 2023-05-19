<<<<<<< HEAD
package Btthuchanhlab4.Students;

import java.util.Scanner;

public class Student {
    private String fullName;
    private int age;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void inputInfo() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Nhap ho ten: ");
            this.fullName = sc.nextLine();
            System.out.print("Nhap tuoi: ");
            this.age = sc.nextInt();
        }
    }

    public void showInfo() {
        System.out.println("Ho ten: " + this.fullName);
        System.out.println("Tuoi: " + this.age);
    }
}
=======
package Btthuchanhlab4.Students;

import java.util.Scanner;

public class Student {
    private String fullName;
    private int age;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void inputInfo() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Nhap ho ten: ");
            this.fullName = sc.nextLine();
            System.out.print("Nhap tuoi: ");
            this.age = sc.nextInt();
        }
    }

    public void showInfo() {
        System.out.println("Ho ten: " + this.fullName);
        System.out.println("Tuoi: " + this.age);
    }
}
>>>>>>> e0bb4f52a9e81a067dd0d8ca8446db41fe3c5b89
