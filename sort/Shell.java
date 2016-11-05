public class Shell extends Sort {
  TimerCount timer = new TimerCount();
  public void sort(int[] a) {
    timer.start(getClass().getSimpleName(), a.length);
    int inc = 4;
    while (inc > 0) {
      for (int i=0; i < a.length; i++) {
        int j = i;
        int tmp = a[i];
        while ((j >= inc) && (a[j-inc] > tmp)) {
          a[j] = a[j - inc];
          j = j - inc;
        }
        a[j] = tmp;
      }
      if (inc/2 != 0)     inc = inc/2;
      else if (inc == 1)  inc = 0;
      else                inc = 1;
    }
    timer.stop();
  }
}
