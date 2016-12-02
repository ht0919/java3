import java.io.*;

public class Li0901 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("rpgsave.dat", true); // STEP1
        fw.write('A');                                       // STEP2
        fw.flush();
        fw.close();                                          // STEP3
    }
}
