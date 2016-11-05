public class SortRun {
  public static void main(String[] args) {
    int n = 10;
    if (args.length != 0) n = Integer.parseInt(args[0]);
    int[] a = new int[n];

    Sort[] sort = {new Bubble(),new Bubble()};
    for (Sort s : sort) {
      for (int i=0; i<a.length; i++) {a[i]=a.length-i;}
      s.sort(a);
    }
  }
}
