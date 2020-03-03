import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class demo02_字符流 {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        //FileWriter fileWriter = new FileWriter("a.txt");
        // properties.setProperty("名字","李建新");
        // properties.setProperty("性别","男");
        //properties.setProperty("年龄","21");
        //properties.store(fileWriter,"");

        properties.load(new FileReader("a.txt"));
        Set<String> keys = properties.stringPropertyNames();
        keys.forEach(key -> {
            System.out.println(key + "=" + properties.getProperty(key));
        });
        //fileWriter.close();
    }
}
