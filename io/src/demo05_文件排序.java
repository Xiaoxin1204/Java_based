import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class demo05_文件排序 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("io\\a.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("io\\b.txt"));
        String line;
        Map<String,String> map = new HashMap<>();
        while ((line = br.readLine()) != null) {
            String[] split = line.split("\\.");
            map.put(split[0],split[1]);
        }

        for (Map.Entry<String, String> entry : map.entrySet()) {
            bw.write(entry.getKey()+entry.getValue());
            bw.newLine();
        }
        bw.close();
        br.close();
    }
}
