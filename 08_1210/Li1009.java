import java.io.*;

public class Li1009 {
    public static void main(String[] args) throws Exception {
        Hero hero1 = new Hero("ミナト", 75, 18);
        // (1)インスタンスの直列化と保存
        FileOutputStream fos =
            new FileOutputStream("rpgsave.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(hero1);                 /* インスタンス→バイト列 */
        oos.flush();
        oos.close();
        // (2)ファイルからインスタンスを復元
        FileInputStream fis =
            new FileInputStream("rpgsave.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Hero hero2 = (Hero) ois.readObject();   /* バイト列→インスタンス */
        ois.close();

        System.out.println("name:"+hero2.name);
        System.out.println("hp:"+hero2.hp);
        System.out.println("mp:"+hero2.mp);

    }
}
