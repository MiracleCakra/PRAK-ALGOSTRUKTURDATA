import java.util.Scanner;
public class PlatKota {
    public static void main(String[] args) {
        System.out.println("Program Mencari Nama Kota Sesuai dg Plat Nomer");
        char[] KODE = {'A', 'B', 'D', 'M', 'F', 'W', 'H', 'L', 'N', 'Z'};
        String[][] KOTA = {
                {"Banten", "DKI Jakarta", "Bandung", "Madura", "Bogor",
                "Sidoarjo", "Semarang", "Surabaya", "Malang", "Sumedang"}
        };
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kode plat nomor: ");
        char inputKode = scanner.next().charAt(0);

        int index = -1;
        for (int i = 0; i < KODE.length; i++) {
            if (KODE[i] == inputKode) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            String namaKota = KOTA[0][index];
            System.out.println("Nama kota untuk kode plat " + inputKode + " adalah: " + namaKota);
        } else {
            System.out.println("Kode plat nomor tidak valid.");
        }
        scanner.close();
    }
}