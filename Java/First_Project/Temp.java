import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements one by one:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = 1;
        int max_val = 0;
        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > max) {
                max = count;
                max_val = arr[i];
            }
        }
        System.out.print("The array: ");
        arr_display(arr);
        if (max == 1) {
            System.out.println("No elements are repeated.");
        } else {
            System.out.printf("%d is repeated %d times.", max_val, max);
        }
        sc.close();
    }

    static void bubble_sort(int[] arr) {
        for (int j = 0; j < arr.length - 1; j++) {
            for (int i = 0; i < arr.length - 1; i++) {

                if (arr[i] > arr[i + 1]) {
                    swtch(arr, i, i + 1);
                } else {
                    continue;
                }
            }
        }
    }

    static void swtch(int[] arr, int a, int b) {
        int t;
        t = arr[a];
        arr[a] = arr[b];
        arr[b] = t;
    }

    static void arr_display(int[] arr) {
        System.out.print("{ ");
        for (int i : arr) {
            System.out.print(i);
            System.out.print(", ");
        }
        System.out.println("}");
    }
}