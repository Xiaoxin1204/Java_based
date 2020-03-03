import java.io.*;

public class demo03_缓冲流 {

    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\a\\软著扫描件.jpg"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\b\\软著扫描件.jpg"));
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes,0,len);
        }
        bos.close();
        bis.close();
    }
}
