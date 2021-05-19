package Bai12;

public class Oto extends PhuongTien{
    private int soGhe;
    private String kieuDongCo;
    public Oto(){}

    public Oto(String hangSanXuat, int namSanXuat, int giaBan, String color, int soGhe, String kieuDongCo) {
        super(hangSanXuat, namSanXuat, giaBan, color);
        this.soGhe = soGhe;
        this.kieuDongCo = kieuDongCo;
    }

    public int getSoGhe() {
        return soGhe;
    }

    public void setSoGhe(int soGhe) {
        this.soGhe = soGhe;
    }

    public String getKieuDongCo() {
        return kieuDongCo;
    }

    public void setKieuDongCo(String kieuDongCo) {
        this.kieuDongCo = kieuDongCo;
    }
    @Override
    public String toString() {
        return "Oto{" +
                "hangSanXuat='" + this.getHangSanXuat() + '\'' +
                ", namSanXuat=" + this.getNamSanXuat() +
                ", giaBan=" + this.getGiaBan() +
                ", color='" + this.getColor() + '\'' +
                ", soGhe='" + this.getSoGhe() + '\'' +
                ", kieuDongCo='" + this.getKieuDongCo() + '\'' +
                '}';
    }
}
