import java.io.*;

public class Hero implements Serializable {
    String name;
    int hp;
    int mp;
    Hero(String name,int hp,int mp) {
      this.name = name;
      this.hp = hp;
      this.mp = mp;
    }
}
