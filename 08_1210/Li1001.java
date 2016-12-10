import java.io.*;
public class Li1001 {
  public void saveHeroToFile(Hero h) throws IOException {
      Writer w = new BufferedWriter(new FileWriter("rpgsave.dat"));
      w.write(h.name + "\n");     // 名前の末尾に改行をつけ保存
      w.write(h.hp + "\n");       // HPの末尾に改行をつけ保存
      w.write(h.mp + "\n");       // MPの末尾に改行をつけ保存
      w.flush();
      w.close();
  }
  public static void main(String[] args) throws IOException {
    Hero h = new Hero();
    h.name = "みなと";
    h.hp = 75;
    h.mp = 18;
    Li1001 p = new Li1001();
    p.saveHeroToFile(h);
  }
}
