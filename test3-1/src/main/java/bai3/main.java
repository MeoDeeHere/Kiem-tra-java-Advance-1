package bai3;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vanban vb = new Vanban();
        do {
            System.out.println("--- MENU ----");
            System.out.println("1. Nhap van ban");
            System.out.println("2. Dem so chu trong van ban");
            System.out.println("3. Chuan hoa van ban");
            System.out.println("4. Viet hoa toan bo");
            System.out.println("5. Viet thuong toan bo");
            System.out.println("6. Viet hoa chu cai dau tien");
            System.out.println("0. Thoat");
            System.out.print("Hay lua chon: ");
            int inputOption = Integer.parseInt(scanner.nextLine());
            switch (inputOption){
                case 1:
                    vb.nhapVanban(scanner);
                    break;
                case 2:
                    System.out.print("So chu cua van ban: ");
                    System.out.println(vb.countWords(vb.getInput()));
                    break;
                case 3:
                    vb.standard(vb.getInput());
                    System.out.println("Chuan hoa");
                    vb.standard(vb.getInput());
                    System.out.println(vb.toString());
                    break;
                case 4:
                    System.out.println("Viet hoa toan bo");
                    vb.upperCase(vb.getInput());
                    System.out.println(vb.toString());
                    break;
                case 5:
                    System.out.println("Viet thuong toan bo");
                    vb.lowerCase(vb.getInput());
                    System.out.println(vb.toString());
                    break;
                case 6:
                    System.out.println("Viet hoa chu cai dau");
                    vb.upperFirstChar(vb.getInput());
                    System.out.println(vb.toString());
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
        }while (true);
    }
}
