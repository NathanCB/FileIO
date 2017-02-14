import jodd.json.JsonParser;
import jodd.json.JsonSerializer;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

public static void main(String[] args) throws IOException {

    SurveyHandler.readAndDisplayFile();

    //if a survey file exist then ask to retake the survey or take the survey.

    System.out.println("Would you like to retake the survey?");
    Scanner scanner = new Scanner(System.in);

    SurveyHandler surveyHandler = new SurveyHandler();

    if(scanner.nextLine().equalsIgnoreCase("y")){
        surveyHandler.askAndAnswer();
    }
    else{
        System.exit(0);
    }

    File f = new File("Main.json");
    JsonSerializer s = new JsonSerializer();
    String json = s.serialize(surveyHandler);//pass the object to be processed
    FileWriter fw = new FileWriter(f);//pass the file name
    fw.write(json);
    fw.close();

    }

}
