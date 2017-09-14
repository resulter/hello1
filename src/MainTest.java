import java.io.File;
public class MainTest {
    /**
     * @param args
     */
    public static void main(String[] args) {
        File f = new File("E:\\workspace1783\\bpm\\src\\main\\java\\cn\\xdf\\bpm\\bj\\modules\\studyservice\\web");
        System.out.println("test666");
        boolean b = false;
        try {
            fileList(f);
        } catch (Exception e) {
        }
    }
    public static void fileList(File file) {
        File[] files = file.listFiles();
        if (files != null) {
            for (File f1 : files) {
                if(!f1.isDirectory()) {
                    System.out.println(f1.getAbsolutePath());
                }
                fileList(f1);
            }
        }
    }
}