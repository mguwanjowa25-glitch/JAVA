import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] A = new int[20];
        int sum = 0;

        System.out.println("20 sany san giriziň:");

        for (int i = 0; i < 20; i++) {
            A[i] = sc.nextInt();
            if (A[i] < 0) {
                sum += A[i];
            }
        }

        System.out.println("Ters sanlaryň goşundysy: " + sum);
    }
}
