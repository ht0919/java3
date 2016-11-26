import org.apache.commons.lang3.builder.*;

public class Li0803 {
    String name;
    String address;
    /* : */
    public boolean equals(Object o) {
        return EqualsBuilder.reflectionEquals(this, o);     /* たった1行でOK */
    }
}