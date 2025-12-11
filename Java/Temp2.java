import java.util.Scanner;

public class Temp2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] stack = new int[n];
        int max = arr[0];
        int pointer = -1;
        for (int j = 0; j < n; j++) {
            int d = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                    d = i;
                }
            }
            arr[d] = 0;
            pointer++;
            stack[pointer] = max;
            max = 0;
        }
        System.out.printf("Minimum element in the stack: %d", stack[n - 1]);
        System.out.printf("Popped element: %d", stack[n - 1]);
        System.out.printf("Minimum element in the stack after popping: %d", stack[n - 2]);
        sc.close();
    }
}
