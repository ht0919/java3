public class SortTest {
  public static void main(String[] args) {
    int n = 10;
    if (args.length != 0) n = Integer.parseInt(args[0]);
    int[] a = new int[n];

    Sort[] sort = {
      new Bubble(),new Select(),new Insert(),
      new Shell(),new Quick(),new Marge(),
    };
    for (Sort s : sort) {
      s.test(a);
    }
  }
}
