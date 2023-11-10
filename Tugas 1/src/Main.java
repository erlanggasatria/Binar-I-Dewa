import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah jam parkir: ");
        int jumlahJamParkir = scanner.nextInt();

        double biayaParkir = hitungBiayaParkir(jumlahJamParkir);

        System.out.println("Biaya parkir yang harus dibayar: $" + biayaParkir);

        scanner.close();
    }

    public static double hitungBiayaParkir(int jumlahJamParkir) {
        double biaya = 0;

        if (jumlahJamParkir <= 5) {
            biaya = 1;
        } else if (jumlahJamParkir <= 24) {
            biaya = 1 + (jumlahJamParkir - 5) * 0.5;
        } else {
            biaya = 15;
        }

        return biaya;
    }
}
