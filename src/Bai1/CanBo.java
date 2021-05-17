package Bai1;

import java.util.Scanner;

public class CanBo{
    private String ten;
    private int tuoi;
    private String gt;
    private String diachi;
    public CanBo() {
    }

    public CanBo(String ten, int tuoi, String gt, String diachi) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.gt = gt;
        this.diachi = diachi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getGt() {
        return gt;
    }

    public void setGt(String gt) {
        this.gt = gt;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

}
