package Bai2;

public class Manager {
    public Document list[];
     public int size=0;
    public Manager(){
        this.list=new Document[20];
    }
    public void add(Document file){
        list[size]=file;
        size++;
    }
    public int delete(String id){
        for (int i = 0; i < size; i++) {
            if (list[i].getmId().equals(id)){
                return i;
            }
        }
        return -1;
    }

}
