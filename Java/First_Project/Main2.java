import java.util.Scanner;

public class Main2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Number: ");
    Long n = sc.nextLong();
    System.out.print("Position: ");
    int p = sc.nextInt();

    Long full = n;
    int count = 0;
    int power = 1;
    while (n >= 1) {
      count++;
      n /= 10;
    }
    for (int i = 0; i < (count - p); i++) {
      power *= 10;
    }
    Long part1 = full / power;
    Long part2 = full % power;
    System.out.printf("Part 1: %d \n", part1);
    System.out.printf("Part 2: %d \n", part2);
    System.out.print(part1 + part2);

  }
}