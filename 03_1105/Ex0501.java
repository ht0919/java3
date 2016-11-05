public class Ex0501 {
  public static void main(String[] args) {
    StrongBox<Integer> s = new StrongBox<Integer>();
    s.put(100);
    System.out.println(s.get());
  }
}
