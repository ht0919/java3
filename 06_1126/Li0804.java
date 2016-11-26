import org.apache.commons.lang3.builder.*;

public class Li0804 {
    /* : */     // 共通部分は省略
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);    /* この1行だけでハッシュ値を生成できる */
    }
}
