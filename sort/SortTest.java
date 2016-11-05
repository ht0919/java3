public class SortTest {
  public static void main(String[] args) {
    int n = 10;
    if (args.length != 0) n = Integer.parseInt(args[0]);
    int[] a = new int[n];

    Sort[] sort = {new Bubble(),new Bubble()};
    for (Sort s : sort) {
      s.test(a);
    }
  }
}
