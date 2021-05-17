package Bai1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuanLy quanLy=new QuanLy();
        CanBo canbo1=new CongNhan("A",15,"nam","HN",1);
        quanLy.themCanBo(canbo1);

        CanBo canbo2=new NhanVien("B",20,"nu","HN","ABC");
        quanLy.themCanBo(canbo2);
        quanLy.hienThiThongTin();
        System.out.println("Tìm theo tên");
        int index =quanLy.timKiemTen("B");
        if(index!=-1){
            System.out.println(quanLy.getDanhSachCanBo()[index]);
    }
}
}
