import java.io.*;

public class Li0903 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos =
          new FileOutputStream("rpgsave.dat", true);
        fos.write(65);      // 65は2進数で 01000001
        fos.flush();
        fos.close();
    }
}
