import java.io.*;

/**
 * 文件复制
 */
public class demo01_字节流 {
    public static void main(String[] args) throws IOException {
       /* File file = new File("D:\\a\\新建文本文档.txt");
        file.renameTo(new File("D:\\a\\a.txt"));*/
        FileInputStream fis = new FileInputStream("D:\\a\\a.txt");
        FileOutputStream fos = new FileOutputStream("D:\\a\\b.txt");
        byte[] chars = new byte[1024];
        int len;
        while ((len = fis.read(chars)) != -1) {
            fos.write(chars, 0, len);
        }
        fos.close();
        fis.close();

    }



}
