package Bai2;

public class Document {
    public static String maSoChu="ABC";
    public static int maSo= 0;

    private String nxb;
    private int number;
    private String mId=maSoChu+maSo;
//    public File(){
//        this.id++;
//    }
//
    public Document(){
    maSo++;
    }
    public Document(String nxb, int issue) {
        maSo++;
        this.nxb = nxb;
        this.number = issue;
    }

    public String getNxb() {
        return nxb;
    }

    public static void setMaSo(int maSo) {
        Document.maSo = maSo;
    }

    public static int getMaSo() {
        return maSo;
    }

    public void setNxb(String nxb) {
        this.nxb = nxb;
    }

    public void setmId(String mId) {
        this.mId = mId;
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
