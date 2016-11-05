import java.util.Arrays;
public class Bubble {
  TimerCount t = new TimerCount();
  public void sort(int[] a) {
    t.start(getClass().getSimpleName(), a.length);
    for (int i=(a.length-1); i>0; i--) {
      for (int j=0; j<i; j++) {
          if (a[j]>a[j+1]) {
            int tmp=a[j+1]; a[j+1]=a[j]; a[j]=tmp;
          }
      }
    }
    t.stop();
  }
}
