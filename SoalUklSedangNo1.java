import java.util.Scanner;

public class SoalUklSedangNo1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        long hasil = 1;

        System.out.print("Masukkan bilangan: ");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            hasil *= i;
        }

        System.out.println("Hasil faktorial: " + hasil);
    }
}

