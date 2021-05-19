package Bai10;

public class VanBan {
    private String st;
    public VanBan(){}
    public VanBan(String st){
        this.st=st;
    }
    public int demsSoKyTuA(){
        int count=0;
        if(st.length()<=0){
            System.out.println("Chuỗi này có mẹ từ nào mà đếm");
        } else {
            for (int i = 0; i < st.length(); i++) {
                if(st.charAt(i)=='a'||st.charAt(i)=='A'){
                    count++;
                }
            }
        }
        return count;
    }
    public int demSoTu(){
        int count=0;
        for (int i = 0; i < st.length(); i++) {
            if(st.charAt(i)==' '){
                count++;
            }

        }
        return count;
    }
}
