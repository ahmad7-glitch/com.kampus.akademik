package com.kampus.akademik.service;

import com.kampus.akademik.model.Dosen;
import com.kampus.akademik.model.Mahasiswa;

public class AkademikService {

    public void tampilMahasiswa(Mahasiswa mhs) {
        System.out.println("Data Mahasiswa");
        System.out.println("----------------");
        mhs.tampilkanData();
    }

    public void tampilDosen(Dosen dsn) {
        System.out.println("Data Dosen");
        System.out.println("----------------");
        dsn.tampilkanData();
    }
}
