package dk.cphbusiness.algorithms.utils;

public class TryUtils {

  private static void tryStopwatch() {
    try (Stopwatch watch = new Stopwatch()) {
      for (int i = 0; i < 1_000_000; i++) {
        if (i%100_000 == 0) System.out.println(i);
        // if (i == 999_999) throw new RuntimeException();
        }
      }
    }

  private static void tryHistogram() {
    int[] list = new int[] {1, 2, 3, 1, 10, 11};
    Histogram histogram = new Histogram(1);
    histogram.print(list);
    }

  public static void main(String... args) {
    tryStopwatch();
    tryHistogram();
    }

  }
