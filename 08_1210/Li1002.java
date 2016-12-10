import java.io.*;
public class Li1002 {
    public void saveHeroToFile(Hero h) throws IOException {
        Writer bw = new BufferedWriter(new FileWriter("rpgsave.dat"));

        /* リスト10-2　ここから */
        bw.write(h.name);
        bw.write(",");    /* デリミタの出力 */
        bw.write(h.hp);
        bw.write(",");
        bw.write(h.mp);
        /* リスト10-2　ここまで */

        bw.flush(); bw.close();
    }
    public static void main(String[] args) throws IOException {
      Hero h = new Hero();
      h.name = "みなと";
      h.hp = 75;
      h.mp = 18;
      Li1002 p = new Li1002();
      p.saveHeroToFile(h);
    }
}
