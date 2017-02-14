import jodd.json.JsonParser;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SurveyHandler {
    String compAnswer;
    String jobAnswer;
    String refAnswer;
    String profAnswer;
    String disAnswer;

    public String getCompAnswer() {
        return compAnswer;
    }

    public void setCompAnswer(String compAnswer) {
        this.compAnswer = compAnswer;
    }

    public String getJobAnswer() {
        return jobAnswer;
    }

    public void setJobAnswer(String jobAnswer) {
        this.jobAnswer = jobAnswer;
    }

    public String getRefAnswer() {
        return refAnswer;
    }

    public void setRefAnswer(String refAnswer) {
        this.refAnswer = refAnswer;
    }

    public String getProfAnswer() {
        return profAnswer;
    }

    public void setProfAnswer(String profAnswer) {
        this.profAnswer = profAnswer;
    }

    public String getDisAnswer() {
        return disAnswer;
    }

    public void setDisAnswer(String disAnswer) {
        this.disAnswer = disAnswer;
    }

    public void askAndAnswer(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you use LinkedIn?");
        compAnswer = scanner.nextLine();

        System.out.println("Do you use it to find jobs?");
        jobAnswer = scanner.nextLine();

        System.out.println("Do you use it for professional references?");
        refAnswer = scanner.nextLine();

        System.out.println("Do you send potential employers your profile link?");
        profAnswer = scanner.nextLine();

        System.out.println("Which feature of LinkedIn do you like the least");
        disAnswer = scanner.nextLine();
    }

    public static void readAndDisplayFile() throws FileNotFoundException {
        File f = null;
        try {
            f = new File("Main.json");
            Scanner s = new Scanner(f);
            s.useDelimiter("\\Z");
            String contents = s.next();
            s.close();
            JsonParser p = new JsonParser();
            SurveyHandler readContents = p.parse(contents, SurveyHandler.class);
            System.out.println(readContents);

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }


    public String toString(){
        return String.format("Do you use LinkedIn? " + compAnswer + "\nDo you use it to find jobs? " + jobAnswer + "\nDo you use it for professional references? " + refAnswer + "\nDo you send potential employers your profile link? " + profAnswer + "\nWhich feature of LinkedIn do you like the least " + disAnswer);
    }



}
