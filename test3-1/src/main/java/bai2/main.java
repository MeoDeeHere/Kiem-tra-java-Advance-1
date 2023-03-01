package bai2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Kythuat kt1 = new Kythuat("t1","tuan","16/03/1999","Lai Chau","Chong phu ba");
        Kythuat kt2 = new Kythuat("t2");
        System.out.print("Nhap ten:");
        kt2.setName(scanner.nextLine());
        System.out.print("Nhap ngay sinh theo dang dd/mm/yyyy:");
        kt2.setDob(scanner.nextLine());
        System.out.print("Nhap dia chi:");
        kt2.setAddress(scanner.nextLine());
        System.out.print("Nhap chuyen nganh:");
        kt2.setMajor(scanner.nextLine());
        System.out.println(kt1.toString());
        System.out.println(kt2.toString());
    }
}
