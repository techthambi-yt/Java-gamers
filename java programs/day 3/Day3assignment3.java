import java.lang.Thread;
public class Day3assignment3 extends Thread {
    public static void main(String[] args) {
    Day3assignment3 a = new Day3assignment3();
      a.start();
      if (a.isAlive()) {
      System.out.println("Waiting...");
    }
    }
    public void run()
    {
        System.out.println("hii");
    }
  }