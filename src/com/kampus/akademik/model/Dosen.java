package com.kampus.akademik.model;

public class Dosen {

    String nidn;
    String nama;
    String matakuliah;

    public Dosen(String nidn, String nama, String matakuliah) {
        this.nidn = nidn;
        this.nama = nama;
        this.matakuliah = matakuliah;
    }

    public void tampilkanData() {
        System.out.println("NIDN : " + nidn);
        System.out.println("Nama Dosen : " + nama);
        System.out.println("Mata Kuliah : " + matakuliah);
    }
}
