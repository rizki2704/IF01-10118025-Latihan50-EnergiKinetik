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
public class Energi {
    private int massa;
    private int kecepatan;

    public int getMassa() {
        return massa;
    }

    public void setMassa(int massa) {
        this.massa = massa;
    }

    public int getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    }

    public double volume(int massa) {
        double volume = (massa * massa * massa) * 0.001;
        return volume;
    }

    public double energiKinetik(int massa, int kecepatan) {
        double EK = (massa * kecepatan * kecepatan * 0.5) / 1000;
        return EK;
    }

    public double usaha() {
        double usaha = (energiKinetik(massa, kecepatan) - energiKinetik(massa, 0));
        return usaha;
    }
}
