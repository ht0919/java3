public class Insert extends Sort {
  TimerCount timer = new TimerCount();
  public void sort(int[] a) {
    timer.start(getClass().getSimpleName(), a.length);
    for (int i=1; i<a.length; i++) {
      int j = i;
      while ((j > 0) && (a[j-1] > a[j])) {
        int tmp=a[j]; a[j]=a[j-1]; a[j-1]=tmp;
        j--;
      }
    }
    timer.stop();
  }
}
