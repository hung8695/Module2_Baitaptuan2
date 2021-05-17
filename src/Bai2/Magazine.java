package Bai2;

public class Magazine  extends Document {
    private int issueNumber;
    private int monthIssue;
    public Magazine(){

    }

    public Magazine(String nxb, int issue, int issueNumber, int monthIssue) {
        super(nxb, issue);
        this.issueNumber = issueNumber;
        this.monthIssue = monthIssue;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    public int getMonthIssue() {
        return monthIssue;
    }

    public void setMonthIssue(int monthIssue) {
        this.monthIssue = monthIssue;
    }

    @Override
    public String toString() {
        return "Book{" +
                "NXB: '"+ getNxb()+'\'' +
                "Number: '"+ getNumber()+'\'' +
                "IssueNumber: '" + getMonthIssue() + '\'' +
                ", MonthIssue: " +getMonthIssue() +
                ", ID=" + getmId()+
                '}';
    }
}
