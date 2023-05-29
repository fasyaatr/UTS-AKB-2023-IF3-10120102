package com.example.uts_akb_if3_10120102.ui.daily;

/*
 * NIM  : 10120102
 *Nama  : Fasya Mutiara Pagi
 *Kelas : IF3
 *Email : fasyamutiara12@gmail.com
 * */

public class ModelDiary {
    private String id;
    private String judul;
    private String date;
    private String month;
    private String year;
    private String isi;

    public ModelDiary(String id, String judul, String isi, String date, String month, String year) {
        this.id = id;
        this.judul = judul;
        this.date = date;
        this.month = month;
        this.year = year;
        this.isi = isi;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getDate() {
        return date;
    }

    public String getMonth() {
        return month;
    }
    public String getYear() {
        return year;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getIsi() {
        return isi;
    }

    public void setIsi(String isi) {
        this.isi = isi;
    }
}

