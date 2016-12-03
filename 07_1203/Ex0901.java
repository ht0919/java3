import java.io.*;

public class Ex0901 {
    public static void main(String[] args) throws Exception {
        String inFile = args[0];
        String outFile = args[1];
        FileInputStream fis = new FileInputStream(inFile);
        FileOutputStream fos = new FileOutputStream(outFile);
        int i = fis.read();
        while(i != -1) {

            char c = (char)i;
            System.out.print(c);

            fos.write(i);
            i = fis.read();
        }
        fos.flush();
        fos.close();
        fis.close();
    }
}
