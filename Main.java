class Main {
  public static void main(String[] args) {
    System.out.println("M&M Color Counts");
    //Total in bag times number of bags
    double Total;
    Total = 55 * 10;

    double Blue;
    Blue = Total * 0.24;
    System.out.println("Blue: " + Blue);

    double Brown;
    Brown = Total * 0.13;
    System.out.println("Brown: " + Brown);

    double Green;
    Green = Total * 0.16;
    System.out.println("Green: " + Green);

    double Orange;
    Orange = Total * 0.20;
    System.out.println("Orange: " + Orange);

    double Red;
    Red = Total * 0.13;
    System.out.println("Red: " + Red);
    double Yellow;
    Yellow = Total * 0.14;
    System.out.println("Yellow: " + Yellow);

    //Adds up total percentage
    double Sum;
    Sum = Blue + Brown + Green + Orange + Red + Yellow;
    System.out.println("Sum: " + Sum);

    if (Blue > Brown && Green > Orange)
      System.out.println("Blue over Brown and Green over Orange");
    if (Brown <= Red)
      System.out.println("Brown is less than or equal to Red");
    if(Sum == Total)
      System.out.println("Numbers Match");
  }
}