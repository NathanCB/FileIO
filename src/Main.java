import jodd.json.JsonParser;
import jodd.json.JsonSerializer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        SurveyHandler surveyHandler = new SurveyHandler();
        Answer answer = new Answer();
        Question question = new Question();
        SurveyHandler.readAndDisplayFile();

        System.out.println("Would you like to retake the survey?");

        while (scanner.nextLine().equalsIgnoreCase("Y")) {
            System.out.println(question.getqCompany());
            answer.setCompAnswer(scanner.nextLine());

            System.out.println(question.getqJob());
            answer.setJobAnswer(scanner.nextLine());

            System.out.println(question.getqReference());
            answer.setRefAnswer(scanner.nextLine());

            System.out.println(question.getqProfile());
            answer.setProfAnswer(scanner.nextLine());

            System.out.println(question.getqDislike());
            answer.setDisAnswer(scanner.nextLine());
        }

        File f = new File("Main.json");
        JsonSerializer s = new JsonSerializer();
        String json = s.serialize(surveyHandler);//pass the object to be processed
        FileWriter fw = new FileWriter(f);//pass the file name
        fw.write(json);
        fw.close();
    }
}