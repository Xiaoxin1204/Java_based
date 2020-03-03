import java.io.*;

public class demo06_转换流 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("io\\c.txt"), "gbk");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("io\\d.txt"), "UTF-8");
        int len;
        while ((len = isr.read()) != -1) {
            osw.write(len);
        }
        osw.close();
        isr.close();
    }
}
