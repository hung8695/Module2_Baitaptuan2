package Bai12;

public class Main {
    public static void main(String[] args) {
        QuanLy quanLy = new QuanLy();
        Oto oto1 = new Oto("ABC", 1999, 1000000, "RED", 50, "AAA");
        XeTai xeTai1 = new XeTai("B", 99, 666, "BLUE", 2);
        XeMay xeMay1 = new XeMay("CC", 99, 666, "BLUE", 2000);
        XeTai xeTai2 = new XeTai("CC", 99, 666, "BLUE", 2);
        Oto oto2 = new Oto("ABC", 99, 666, "RED", 2,"bbb");
        quanLy.add(oto1);
        quanLy.add(oto2);

        quanLy.add(xeMay1);
        quanLy.add(xeTai1);
        quanLy.add(xeTai2);
        System.out.println("Danh sách phương tiện: ");
        quanLy.display();
        System.out.println("---------------------");
            quanLy.find("CC","BLUE");
    }
}
