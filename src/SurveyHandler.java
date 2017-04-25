import jodd.json.JsonParser;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SurveyHandler {

    Question question = new Question();
    Answer answer = new Answer();

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
        return String.format(question.getqCompany()+ " " + answer.getCompAnswer() + "\n" +
                question.getqJob() + " " + answer.getJobAnswer() + "\n" +
                question.getqReference() + " " + answer.getRefAnswer() + "\n" +
                question.getqProfile() + " " + answer.getProfAnswer() + "\n" +
                question.getqDislike() + " "  + answer.getDisAnswer());
    }
}