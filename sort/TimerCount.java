public class TimerCount {
  long start;
  public void start(String s, int n) {
    this.start = System.nanoTime();
    System.out.print(s+": "+n+" -> ");
  }
  public void stop() {
    long stop = System.nanoTime();
    System.out.println("Time:"+(stop-this.start)/1000000f+" ms");
  }
}
