import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Li1007 {
    /* リスト10-7　ここから */
    public Hero loadHeroFromFile() throws IOException {
        BufferedReader br =
        		new BufferedReader(new FileReader("rpgsave.dat"));
        String name = br.readLine();    // 改行まで名前として読む
        String hp = br.readLine();      // 改行までHPとして読む
        String mp = br.readLine();      // 改行までMPとして読む
        br.close();
        return new Hero
          (name,Integer.parseInt(hp), Integer.parseInt(mp));
    }
    /* リスト10-7　ここまで */
    public static void main(String[] args) throws IOException {
      Li1007 s = new Li1007();
      Hero h = s.loadHeroFromFile();
      System.out.println(h.name);
      System.out.println(h.hp);
      System.out.println(h.mp);
    }
}
