package Bai12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class QuanLy {
   private List<PhuongTien> danhSachPhuongTien;

    public List<PhuongTien> getDanhSachPhuongTien() {
        return danhSachPhuongTien;
    }

    public void setDanhSachPhuongTien(List<PhuongTien> danhSachPhuongTien) {
        this.danhSachPhuongTien = danhSachPhuongTien;
    }

    public  QuanLy(){
       danhSachPhuongTien =new ArrayList<>();
   }
   public void add(PhuongTien pt){
       danhSachPhuongTien.add(pt);
   }
   public void remove(PhuongTien pt){
       danhSachPhuongTien.remove(pt);
   }
   public void find(String hangsanxuat,String color){
//       Iterator<? extends PhuongTien> itr = danhSachPhuongTien.iterator();
//       while (itr.hasNext()){
//           if(itr.next().getHangSanXuat().equals(hangsanxuat) && itr.next().getColor().equals(color)){
//               System.out.println(itr.next());
//           }
//       }
       for (int i = 0; i <danhSachPhuongTien.size() ; i++) {
           if(danhSachPhuongTien.get(i).getColor().equals(color)||danhSachPhuongTien.get(i).getHangSanXuat().equals(hangsanxuat)){
           danhSachPhuongTien.get(i).toString();
       }}
   }
   public void display() {
       Iterator<? extends PhuongTien> itr = danhSachPhuongTien.iterator();
       while (itr.hasNext()) {
           System.out.println(itr.next());
       }
   }
}
