import java.util.Scanner;
//Patika.dev linkim --> https://app.patika.dev/ailker
public class Main {
    static void desen() {
        Scanner input = new Scanner(System.in);
        System.out.print("N Sayisi : ");
        int n = input.nextInt();
        int a = 0;
        System.out.print("Ciktisi :");
        for (int i = n; i >= -4; i -= 5) {
            System.out.print(" " + i);
            if (i <= 0) {
                for (int b = i + 5; b <= n; b += 5) {
                    System.out.print(" " + b);
                }
            }
        }
    }

    public static void main(String[] args) {
        desen();
    }
}