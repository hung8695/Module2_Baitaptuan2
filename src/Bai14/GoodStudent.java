package Bai14;

import java.util.Date;

public class GoodStudent extends Student{
    private float gpa;
    private String bestRewardName;
    public GoodStudent(){

    }


    public GoodStudent(String fullName, Date doB, boolean sex, String phoneNumber, String universityName, String gradeLevel, float gpa, String bestRewardName) {
        super(fullName, doB, sex, phoneNumber, universityName, gradeLevel);
        this.gpa = gpa;
        this.bestRewardName = bestRewardName;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public String getBestRewardName() {
        return bestRewardName;
    }

    public void setBestRewardName(String bestRewardName) {
        this.bestRewardName = bestRewardName;
    }
    @Override
    public String showMyInfor() {
        return "Nomal Student [Fullname: "+getFullName()+", DoB: "+getDoB()+", Sex: "+getSex()
                +",Phone: "+getPhoneNumber()+", UniversityName: "+getUniversityName()
                +", Grade level: "+getGradeLevel()+", GPA: "+getGpa()+
                ", Best rewward name: "+getBestRewardName()+"]";
    }
}
