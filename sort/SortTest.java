import java.util.Arrays;
public class SortTest {
  public static void main(String[] args) {
    int n = 10;
    if (args.length != 0) n = Integer.parseInt(args[0]);
    int[] a = new int[n];
    for (int i=0; i<a.length; i++) {a[i]=a.length-i;}

    System.out.println("実行前："+Arrays.toString(a));
    Bubble b = new Bubble(); b.sort(a);
    System.out.println("実行後："+Arrays.toString(a));

  }
}
