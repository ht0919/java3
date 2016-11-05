public class Quick {
  TimerCount timer = new TimerCount();
  public void sort(int[] a) {
    timer.start(getClass().getSimpleName(), a.length);
    this.q_sort(a, 0, a.length-1);
    timer.stop();
  }
  void q_sort(int[] a, int left, int right) {
    int l_hold = left;
    int r_hold = right;
    int pivot = a[left];
    while (left < right) {
      while ((a[right] >= pivot) && (left < right))
        right--;
      if (left != right) {
        a[left] = a[right];
        left++;
      }
      while ((a[left] <= pivot) && (left < right))
        left++;
      if (left != right) {
        a[right] = a[left];
        right--;
      }
    }
    a[left] = pivot;
    pivot = left;
    left = l_hold;
    right = r_hold;
    if (left < pivot)   q_sort(a, left, pivot-1);
    if (right > pivot)  q_sort(a, pivot+1, right);
  }
}
