/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan1;

/**
 *
 * @author ASUS
 */
public class Pendaftaran {
    public static void main(String[] args){
        Mahasiswa mhs = new Mahasiswa();
        mhs.nama = "Cindy";
        mhs.nobp = "2101092004";
        mhs.kelas = "MI2B";
        mhs.prodi = "MI";
        mhs.jurusan = "Teknologi Informasi";
        
        System.out.println("Mahasiswa 1");
        System.out.println("Nama    : " +mhs.nama);
        System.out.println("No Bp   : " +mhs.nobp);
        System.out.println("Kelas   : " +mhs.kelas);
        System.out.println("Prodi   : " +mhs.prodi);
        System.out.println("Jurusan : " +mhs.jurusan);
    }
}
