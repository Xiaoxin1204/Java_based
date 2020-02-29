import java.io.File;
import java.io.IOException;

public class demo {
    public static void main(String[] args) throws IOException {
        /*int jc = jc(4);
        System.out.println(jc);*/
       /* File file = new File("D:\\视频教程\\传智健康项目（13天）");
        d(file);*/
       /*String a = "D:\\视频教程\\传智健康项目（13天）\\day01\\01【瑞客论坛 www.ruike1.com】.avi";
        String b = a.replace("【瑞客论坛 www.ruike1.com】", "");
        System.out.println(a);
        System.out.println(b);*/
       /* File file = new File("D:\\a\\b.txt");
        String newName = file.getAbsolutePath().replace("b", "c");
        file.renameTo(new File(newName));
        System.out.println();*/
     /*   file.renameTo(new File("a.txt"));
        System.out.println(file.exists());*/
        File file = new File("D:\\视频教程\\传智健康项目（13天）");
        d(file);

    }
    /*
        批量删除文件重复名。
     */
    private static void d(File file) {
        String godie = "【瑞客论坛 www.ruike1.com】";
        File[] files = file.listFiles(pathname -> pathname.isDirectory() || pathname.getName().toLowerCase().contains(godie));

        for (File f : files) {
            if (f.isDirectory()) {
                d(f);
            } else {
                String newName = f.getAbsolutePath().replace(godie, "");
                f.renameTo(new File(newName));
                System.out.println(new File(newName).getAbsolutePath());
            }
        }
    }

    /*
       文件搜索
     */
    private static void c(File file) {
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isDirectory()) {
                c(f);
            } else {
                if (f.getName().toLowerCase().endsWith(".doc")) {
                    System.out.println(f);
                }
            }
        }
    }


    /*
    递归打印多级目录
     */
    private static void b(File file) {
        File[] files = file.listFiles();
        System.out.println(file);
        for (File f : files) {
            if (f.isDirectory()) {
                b(f);
            } else {
                System.out.println(f);
            }
        }
    }

    /*
    计算n的阶乘
     */
    private static int jc(int n) {

        if (n == 1) {
            return 1;
        }
        return n * jc(n - 1);
    }


}
