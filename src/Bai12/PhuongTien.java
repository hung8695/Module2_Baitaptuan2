package Bai12;

public class PhuongTien {
   private String hangSanXuat;
   private int namSanXuat;
    private int giaBan;
    private String color;
    public PhuongTien(){}

    public PhuongTien(String hangSanXuat, int namSanXuat, int giaBan, String color) {
        this.hangSanXuat = hangSanXuat;
        this.namSanXuat = namSanXuat;
        this.giaBan = giaBan;
        this.color = color;
    }

    public String getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(String hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}
