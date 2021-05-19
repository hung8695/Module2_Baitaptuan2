package Bai14;

import java.util.Date;

public class NormalStudent extends Student{
    private int englishScore;
    private float entryTestScore;
    public NormalStudent(){

    }


    public NormalStudent(String fullName, Date doB, boolean sex, String phoneNumber, String universityName, String gradeLevel, int englishScore, float entryTestScore) {
        super(fullName, doB, sex, phoneNumber, universityName, gradeLevel);
        this.englishScore = englishScore;
        this.entryTestScore = entryTestScore;
    }

    public int getEnglishScore() {
        return englishScore;
    }

    public void setEnglishScore(int englishScore) {
        this.englishScore = englishScore;
    }

    public float getEntryTestScore() {
        return entryTestScore;
    }

    public void setEntryTestScore(float entryTestScore) {
        this.entryTestScore = entryTestScore;
    }

    @Override
    public String showMyInfor() {
        return "Nomal Student [Fullname: "+getFullName()+", DoB: "+getDoB()+", Sex: "+getSex()
                +",Phone: "+getPhoneNumber()+", UniversityName: "+getUniversityName()
                +", Grade level: "+getGradeLevel()+", English score: "+getEnglishScore()+
                ", Entry test score: "+getEntryTestScore()+"]";
    }
}
