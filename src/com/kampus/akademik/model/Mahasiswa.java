package com.kampus.akademik.model;

public class Mahasiswa {

    String nim;
    String nama;
    String jurusan;

    public Mahasiswa(String nim, String nama, String jurusan) {
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
    }

    public void tampilkanData() {
        System.out.println("NIM : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Jurusan : " + jurusan);
    }
}
