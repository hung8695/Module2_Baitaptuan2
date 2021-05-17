package Bai2;

public class Newspaper extends Document {
    private int dayIssue;
    public Newspaper(){

    }
    public Newspaper(String nxb, int issue, int dayIssue) {
        super(nxb, issue);
        this.dayIssue = dayIssue;
    }

    public int getDayIssue() {
        return dayIssue;
    }

    public void setDayIssue(int dayIssue) {
        this.dayIssue = dayIssue;
    }

    public String toString() {
        return "Book{" +
                "NXB: '"+ getNxb()+'\'' +
                "Number: '"+ getNumber()+'\'' +
                "DayIssue: '" + getDayIssue() + '\'' +
                ", ID=" + getmId()+
                '}';
    }
}
