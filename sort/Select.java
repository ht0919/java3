public class Select extends Sort {
  TimerCount timer = new TimerCount();
  public void sort(int[] a) {
    timer.start(getClass().getSimpleName(), a.length);
    for (int i=0; i<(a.length-1); i++) {
      int min=a[i]; int k=i;
      for (int j=i+1; j<a.length; j++) {
          if (a[j]<min) {
            min=a[j]; k=j;
          }
      }
      a[k]=a[i]; a[i]=min;
    }
    timer.stop();
  }
}
