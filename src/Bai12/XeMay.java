package Bai12;

public class XeMay extends PhuongTien {
    private int congSuat;

    public XeMay() {
    }

    public XeMay(String hangSanXuat, int namSanXuat, int giaBan, String color, int congSuat) {
        super(hangSanXuat, namSanXuat, giaBan, color);
        this.congSuat = congSuat;
    }

    public int getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(int congSuat) {
        this.congSuat = congSuat;
    }

    @Override
    public String toString() {
        return "XeMay{" +
                "hangSanXuat='" + this.getHangSanXuat() + '\'' +
                ", namSanXuat=" + this.getNamSanXuat() +
                ", giaBan=" + this.getGiaBan() +
                ", color='" + this.getColor() + '\'' +
                ", congSuat='" + this.getCongSuat() + '\'' +

                '}';
    }
}
