package Bai12;

public class XeTai extends PhuongTien{
    private int trongTai;
    public XeTai(){}

    public XeTai(String hangSanXuat, int namSanXuat, int giaBan, String color, int trongTai) {
        super(hangSanXuat, namSanXuat, giaBan, color);
        this.trongTai = trongTai;
    }

    public int getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(int trongTai) {
        this.trongTai = trongTai;
    }
    @Override
    public String toString() {
        return "XeTai{" +
                "hangSanXuat='" + this.getHangSanXuat() + '\'' +
                ", namSanXuat=" + this.getNamSanXuat() +
                ", giaBan=" + this.getGiaBan() +
                ", color='" + this.getColor() + '\'' +
                ", trongTai='" + this.getTrongTai() + '\'' +

                '}';
    }
}
