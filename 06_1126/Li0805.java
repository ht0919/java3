import org.apache.commons.logging.*;

public class Li0805 {
    public static void main(String[] args) {
        Log logger = LogFactory.getLog(Li0805.class);     /* ロガーの取得 */
        if(args.length != 2) {
            logger.error("起動引数の数が異常：" + args.length);
        }
    }
}
