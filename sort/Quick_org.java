public class Quick_org {
  TimerCount timer = new TimerCount();
  public void sort(int[] a) {
    timer.start(getClass().getSimpleName(), a.length);
    this.quick_sort(a, 0, a.length-1);
    timer.stop();
  }
  void quick_sort(int[] a, int left, int right) {
    if (left>=right) return;
    int p = a[(left+right)/2];
    int l = left, r = right, tmp;
    while(l<=r) {
      while(a[l] < p) { l++; }
      while(a[r] > p) { r--; }
      if (l<=r) {
          tmp=a[l]; a[l]=a[r]; a[r]=tmp;
          l++; r--;
      }
    }
    quick_sort(a, left, r);
    quick_sort(a, l, right);
  }
}
