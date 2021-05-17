package Bai1;

public class CongNhan extends CanBo {
    private int level;

    public CongNhan() {
    }

    public CongNhan(String ten, int tuoi, String gt, String diachi, int level) {
        super(ten, tuoi, gt, diachi);
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
    public String toString() {
        return "Công nhân{" +
                "Bậc: " + this.getLevel() +
                ", Tên: " + this.getTen()  +
                ", Tuổi: " + this.getTuoi() +
                ", Giới tính: " + this.getGt()  +
                ", Địa chỉ: " + this.getDiachi() +
                '}';
    }
}
