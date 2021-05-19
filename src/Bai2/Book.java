package Bai2;

public class Book extends Document{
    private String nameAuthor;
    private int page;
public Book(){
}
    public Book(String nxb, int issue, String nameAuthor, int page) {
        super(nxb, issue);
        this.nameAuthor = nameAuthor;
        this.page = page;

    }


    public String getNameAuthor() {
        return nameAuthor;
    }

    public void setNameAuthor(String nameAuthor) {
        this.nameAuthor = nameAuthor;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }


    @Override
    public String toString() {
        return "Book{" +
                "NXB='"+ getNxb()+'\'' +
                "Number='"+ getNumber()+'\'' +
                "nameAuthor='" + nameAuthor + '\'' +
                ", page=" + page +
                ", ID=" + getmId()+
                '}';
    }
}
