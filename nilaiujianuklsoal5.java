package latihanukl;
//latihan untuk menghitung nilai ujian
//soal sulit 5
import java.util.Scanner;
public class nilaiujianuklsoal5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan jumlah Siswa: ");
        int jumlahSiswa = input.nextInt();

        Double totalNilai = 0.0;
        for (int i = 1; i <= jumlahSiswa; i++) {
            System.out.println("Masukkan nilai siswa ke-" + i + ": ");
            double nilai = input.nextDouble();
            totalNilai += nilai;
        }
        double rataRata = totalNilai / jumlahSiswa;
        System.out.println("Rata-rata seluruh nilai siswa adalah : " + rataRata);
        input.close();
    }
}