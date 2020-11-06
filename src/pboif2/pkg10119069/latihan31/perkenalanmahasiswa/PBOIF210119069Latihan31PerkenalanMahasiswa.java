/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119069.latihan31.perkenalanmahasiswa;

/**
 *
 * @author 
 * NAMA     : TRI NOVAREL RAHMADHANI
 * KELAS    : PBOIF2
 * NIM      : 10119069
 * Deskripsi Program    : program ini berisi program perkenalan mahasiswa
 */
public class PBOIF210119069Latihan31PerkenalanMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mahasiswa mhs = new Mahasiswa();
        
        mhs.nim = "10119066";
        mhs.nama = "Nezya Tariska";

        mhs.perkenalkanDiri();

        mhs.nim = "10119067";
        mhs.nama = "Andreas Danhago Putra Irj";

        mhs.perkenalkanDiri();

        mhs.nim = "10119068";
        mhs.nama = "Tatang Sulaeman";

        mhs.perkenalkanDiri();

        mhs.nim = "10119069";
        mhs.nama = "Tri Novarel Rahmadhani";

        mhs.perkenalkanDiri();
        
        System.out.println("-------------------------------------");
        System.out.println("Developed by : Tri Novarel Rahmadhani");

    }
    
}
