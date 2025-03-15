import java.util.Scanner;

public class If1 {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        
        System.out.print("Contoh IF satu kasus \n");
        System.out.print("Ketikkan suatu nilai integer : ");
        
        int a = masukan.nextInt();  // Mendeklarasikan variabel 'a' sebagai integer
        
        if (a >= 0) {
            System.out.print("\nNilai a positif " + a);
        }
    }
}
