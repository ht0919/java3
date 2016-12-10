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
        return new Hero(name,Integer.parseInt(hp), Integer.parseInt(mp));
    }
    /* リスト10-7　ここまで */
    public static void main(String[] args) throws IOException {
      Li1007 p = new Li1007();
      Hero h = p.loadHeroFromFile();
      System.out.println("name:"+h.name);
      System.out.println("hp:"+h.hp);
      System.out.println("mp:"+h.mp);
    }
}
