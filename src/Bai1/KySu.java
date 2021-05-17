package Bai1;

public class KySu extends CanBo{
    private String  nganhDaoTao;

    public KySu(String ten, int tuoi, String gt, String diachi,String nganhDaoTao){
        super(ten,tuoi,gt,diachi);
        this.nganhDaoTao=nganhDaoTao;
    }
    public KySu(){

    }
    public String getNganhDaoTao() {
        return nganhDaoTao;
    }

    public void setNganhDaoTao(String nganhDaoTao) {
        this.nganhDaoTao = nganhDaoTao;
    }
    public String toString() {
        return "Kỹ sư{" +
                "Ngành đào tạo: " + this.getNganhDaoTao() +
                ", Tên: " + this.getTen()  +
                ", Tuổi: " + this.getTuoi() +
                ", Giới tính: " + this.getGt()  +
                ", Địa chỉ: " + this.getDiachi() +
                '}';
    }
}
