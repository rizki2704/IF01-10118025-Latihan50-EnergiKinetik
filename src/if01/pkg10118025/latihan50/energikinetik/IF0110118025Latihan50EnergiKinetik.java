/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pkg10118025.latihan50.energikinetik;

/**
 * Nama     : Rizki Restu Illahi
 * NIM      : 10118025
 * Kelas    : IF-01
 */
public class IF0110118025Latihan50EnergiKinetik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Energi e = new Energi();
        e.setMassa(145);
        e.setKecepatan(25);

        System.out.println("         ===Energi Kinetik===");
        System.out.printf("Massa \t\t\t\t: %d g%n", e.getMassa());
        System.out.printf("Kecepatan \t\t\t: %d m/s%n", e.getKecepatan());
        System.out.printf("Volume \t\t\t\t: %.3f m3%n", e.volume(e.getMassa()));
        System.out.printf("Energi Kinetik \t\t\t: %.4f J%n", e.energiKinetik(e.getMassa(), e.getKecepatan()));
        System.out.printf("Usaha dimulai dari keadaan diam : %.4f J%n", e.energiKinetik(e.getMassa(), e.getKecepatan()));

    }
    
}
