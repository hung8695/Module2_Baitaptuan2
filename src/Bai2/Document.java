package Bai2;

public class Document {
    public static String maSoChu="ABC";
    public static int maSo= 1;

    private String nxb;
    private int number;
    private String mId=maSoChu+maSo;
//    public File(){
//        this.id++;
//    }
//
    public Document(){
    this.maSo++;
    }
    public Document(String nxb, int issue) {
        this.nxb = nxb;
        this.number = issue;
        this.maSo++;
    }

    public String getNxb() {
        return nxb;
    }

    public void setNxb(String nxb) {
        this.nxb = nxb;
    }

    public int getNumber() {
        return number;
    }

    public String getmId() {
        return mId;
    }



    public void setNumber(int number) {
        this.number = number;
    }


}
