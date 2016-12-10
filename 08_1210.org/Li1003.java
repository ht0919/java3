import java.util.*;

public class Li1003 {
    public static void main(String[] args) {
        String s = "ミナト,アサカ,スガワラ";
        StringTokenizer st = new StringTokenizer(s,",");    /* カンマをデリミタ指定 */
        while(st.hasMoreTokens()) {                         /* 次のトークンがあるか検査 */
            String t = st.nextToken();                      /* 次のトークンを取得 */
            System.out.println(t);
        }
    }
}
