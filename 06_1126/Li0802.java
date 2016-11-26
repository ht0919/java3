public class Li0802 {
    String name;
    String adress;
    /* : */
    public boolean equals(Object o) {
        if(o == this) return true;                      /* 基本的な判定 */
        if(o == null) return false;
        if(!(o instanceof Li0802)) return false;
        Li0802 r = (Li0802) o;
        if(!this.name.equals(r.name)) return false;     /* 各フィールドを比較して判定する部分 */
        if(!this.adress.equals(r.adress)) return false;
        return true;
    }
}
