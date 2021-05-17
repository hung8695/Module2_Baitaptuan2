package Bai1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLy {
    private CanBo [] danhSachCanBo;
            int size=0;
    public QuanLy(){
         this.size=0;
        this.danhSachCanBo=new CanBo[20];
    }

    public CanBo[] getDanhSachCanBo() {
        return danhSachCanBo;
    }

    public void themCanBo(CanBo canBo){
            this.danhSachCanBo[size]=canBo;
            this.size++;
    }



    public void hienThiThongTin(){
        for (int i = 0; i < this.size; i++) {
            System.out.println(danhSachCanBo[i].toString());
        }
    }
    public int timKiemTen(String ten){
        for (int i = 0; i <size ; i++) {
            if(ten.equals(danhSachCanBo[i].getTen())){
                return i;
            }
        }
        return -1;
    }


}
