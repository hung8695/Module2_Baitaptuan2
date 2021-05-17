package Bai1;

public class NhanVien extends CanBo{
    private String congViec;

    public NhanVien(String ten, int tuoi, String gt, String diachi, String congViec) {
        super(ten, tuoi, gt, diachi);
        this.congViec = congViec;
    }
    public NhanVien(){
    }

    public NhanVien(String ten, int tuoi, String gt, String diachi) {
        super(ten, tuoi, gt, diachi);
    }

    public String getCongViec() {
        return congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }
    public String toString() {
        return "Nhân viên{" +
                "Công việc: " + this.getCongViec()  +
                ", Tên: " + this.getTen()  +
                ", Tuổi: " + this.getTuoi() +
                ", Giới tính: " + this.getGt() +
                ", Địa chỉ: " + this.getDiachi() +
                '}';
    }

}
