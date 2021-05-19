package Bai2;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        String str="ABC3";

        Document dc1=new Book("A",21,"gfd",58);
        Document dc2=new Book("A",21,"gfd",58);
        Document dc3=new Book("A",21,"gfd",58);
        Document dc4=new Book("A",21,"gfd",58);
        Document dc5=new Book("A",21,"gfd",58);
        Document dc6=new Book("A",21,"gfd",58);

        manager.add(dc1);
        manager.add(dc2);
        manager.add(dc3);
        manager.add(dc4);
        manager.add(dc5);
        manager.add(dc6);
        manager.display();
        System.out.println("--------------------------");
        int n=manager.findId(str);
        System.out.println(n);
        if(manager.findId(str)!=-1){
            for (int i = manager.findId(str); i < manager.size ; i++) {
                 manager.list[i]=manager.list[i+1];
            }
            manager.size--;
            Document.maSo--;
        }
        for (int i = n; i < manager.size ; i++) {
            manager.list[i].setmId(Document.maSoChu+i);
        }
       manager.display();
        System.out.println("--------------");
        Document dc7=new Book("A",21,"gfd",58);
        manager.add(dc7);
        manager.display();


    }
}
