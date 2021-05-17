package Bai1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String ten;
        int tuoi;
        String diachi;
        String gt;
        QuanLy quanLy=new QuanLy();
        Scanner scanner= new Scanner(System.in);
    while (true) {
        menu();
        System.out.println("Nhập lựa chọn !");
        String luachon = scanner.nextLine();

        switch (luachon) {
            case "1": {
                System.out.println("a. Thêm nhân viên");
                System.out.println("b. Thêm kỹ sư");
                System.out.println("c. Thêm công nhân");
                System.out.println("Nhập lựa chọn: ");
                String type = scanner.nextLine();
                switch (type) {
                    case "a":
                        System.out.println("Nhập tên: ");
                        ten = scanner.nextLine();
                        System.out.println("Nhập tuổi: ");
                        tuoi = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Nhập địa chỉ: ");
                        diachi = scanner.nextLine();
                        System.out.println("Nhập giới tính: ");
                        gt = scanner.nextLine();
                        System.out.println("Nhập công việc: ");
                        String congViec = scanner.nextLine();
                        CanBo canBo1 = new NhanVien(ten, tuoi, gt, diachi, congViec);
                        quanLy.themCanBo(canBo1);
                        System.out.println("Bạn vừa thêm: " + canBo1.toString());
                        menu1();
                        break;
                    case "b":
                        System.out.println("Nhập tên: ");
                        ten = scanner.nextLine();
                        System.out.println("Nhập tuổi: ");
                        tuoi = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Nhập địa chỉ: ");
                        diachi = scanner.nextLine();
                        System.out.println("Nhập giới tính: ");
                        gt = scanner.nextLine();
                        System.out.println("Ngành đào tạo: ");
                        String nganhDaoTao = scanner.nextLine();
                        CanBo canBo2 = new KySu(ten, tuoi, gt, diachi, nganhDaoTao);
                        quanLy.themCanBo(canBo2);
                        System.out.println("Bạn vừa thêm: " + canBo2.toString());
                        menu1();
                        break;
                    case "c":
                        System.out.println("Nhập tên: ");
                        ten = scanner.nextLine();
                        System.out.println("Nhập tuổi: ");
                        tuoi = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Nhập địa chỉ: ");
                        diachi = scanner.nextLine();
                        System.out.println("Nhập giới tính: ");
                        gt = scanner.nextLine();
                        System.out.println("Nhập công việc: ");
                        int level = scanner.nextInt();
                        CanBo canBo3 = new CongNhan(ten, tuoi, gt, diachi, level);
                        quanLy.themCanBo(canBo3);
                        System.out.println("Bạn vừa thêm: " + canBo3.toString());
                        menu1();
                        break;
                    default:
                        System.out.println("Invalid");
                        break;

                }

            }
            break;
            case "2": {
                System.out.println("Nhập tên cần tìm kiếm: ");
                String name=scanner.nextLine();
                quanLy.timKiemTen(name);
                break;
            }
            case "3":{
                quanLy.hienThiThongTin();
                break;
            }
            case "4":
                System.exit(0);
            default:
                System.out.println("Invalid");
        }

    }}
    public static void menu(){
        System.out.println("1. Thêm");
        System.out.println("2. Tìm kiếm theo tên");
        System.out.println("3. Hiện thị danh sách các cán bộ");
        System.out.println("4. Thoát");

    }
     static void menu1(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Bấm phím bất kỳ để ra menu lựa chọn! ");
        String luachon=sc.nextLine();
    }
    static void nhapThongTin(){

            Scanner scanner=new Scanner(System.in);
            System.out.println("Nhập tên: ");
            String ten = scanner.nextLine();
            System.out.println("Nhập tuổi: ");
            int tuoi= scanner.nextInt();
            scanner.nextLine();
            System.out.println("Nhập địa chỉ: ");
            String diachi=scanner.nextLine();
            System.out.println("Nhập giới tính: ");
            String gt=scanner.nextLine();

    }

}

