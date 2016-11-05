// 選択ソートによる並べ替え
import java.util.Arrays;
public class Select1 {
  public static void main(String[] args) {
    //int[] a={10,9,8,7,6,5,4,3,2,1};
    int[] a=new int[100000];
    for (int i=0; i<a.length; i++) {
      a[i]=a.length-i;
    }
    // 実行前に表示
    //System.out.println("実行前："+Arrays.toString(a));
    // 選択ソートによる並べ替え
    TimerCount t = new TimerCount();
    t.start();
    for (int i=0; i<(a.length-1); i++) {
      //System.out.print((i+1)+"回目：");
      int min=a[i]; int k=i;
      for (int j=i+1; j<a.length; j++) {
          if (a[j]<min) {
            min=a[j]; k=j;
          }
      }
      //System.out.print(a[i]+"<->"+a[k]+" ");
      a[k]=a[i]; a[i]=min;
      //System.out.println();
      //System.out.println((i+1)+"回目："+Arrays.toString(a));
    }
    t.stop();
    // 実行後に表示
    //System.out.println("実行後："+Arrays.toString(a));
  }
}
