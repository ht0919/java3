import java.util.Arrays;
public abstract class Sort {
  public void test(int[] a) {
    for (int i=0; i<a.length; i++) {a[i]=a.length-i;}
    System.out.println("実行前："+Arrays.toString(a));
    this.sort(a);
    System.out.println("実行後："+Arrays.toString(a));
  }
  public abstract void sort(int[] a);
}
