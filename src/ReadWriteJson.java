import jodd.json.JsonSerializer;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWriteJson {

public static void readWriteJson() throws IOException {

        String passToJson = new String();
        File f = new File("Main.json");

        JsonSerializer s = new JsonSerializer();

        String json = s.serialize(passToJson);//pass the object to be processed

        FileWriter fw = new FileWriter(f);//pass the file name

        fw.write(json);
        fw.close();

        }
}
