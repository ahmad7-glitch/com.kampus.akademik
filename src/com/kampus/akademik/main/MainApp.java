package com.kampus.akademik.main;

import com.kampus.akademik.model.Dosen;
import com.kampus.akademik.model.Mahasiswa;
import com.kampus.akademik.service.AkademikService;

public class MainApp {

    public static void main(String[] args) {

        Mahasiswa mhs1 = new Mahasiswa(
                "210401010192",
                "Ahmad Asy'ari",
                "Informatika"
        );

        Dosen dosen1 = new Dosen(
                "D001",
                "Alun Sujjada, S.Kom., M.T",
                "Pemrograman Berorientasi Objek"
        );

        AkademikService service = new AkademikService();

        service.tampilMahasiswa(mhs1);
        System.out.println();
        service.tampilDosen(dosen1);
    }
}

