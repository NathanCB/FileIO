import java.util.Map;

public class Question {

    String qCompany = "Do you use LinkedIn? ";
    String qJob = "Do you use it to find jobs? ";
    String qReference = "Do you use it for professional references? ";
    String qProfile = "Do you send potential employers your profile link? ";
    String qDislike = "Which feature of LinkedIn do you like the least ";

    public Question(){}

    public String getqCompany() {
        return qCompany;
    }

    public void setqCompany(String qCompany) {
        this.qCompany = qCompany;
    }

    public String getqJob() {
        return qJob;
    }

    public void setqJob(String qJob) {
        this.qJob = qJob;
    }

    public String getqReference() {
        return qReference;
    }

    public void setqReference(String qReference) {
        this.qReference = qReference;
    }

    public String getqProfile() {
        return qProfile;
    }

    public void setqProfile(String qProfile) {
        this.qProfile = qProfile;
    }

    public String getqDislike() {
        return qDislike;
    }

    public void setqDislike(String qDislike) {
        this.qDislike = qDislike;
    }
}
