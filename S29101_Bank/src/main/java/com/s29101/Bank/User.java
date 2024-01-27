package com.s29101.Bank;


public class User {
    private int id;
    private double saldo;
    private String imie;
    private String nazwisko;
    public User(int ID, double SALDO, String Imie, String Nazwisko) { id = ID; saldo = SALDO; imie = Imie; nazwisko = Nazwisko; }
    public void addSaldo(double dodaneSaldo) { this.saldo += dodaneSaldo; }
    public void removeSaldo(double usunSaldo) { this.saldo -= usunSaldo; }
    public void setSaldo(double ustawioneSaldo) { this.saldo = ustawioneSaldo; }
    public String getImie() { return imie; }
    public String getNazwisko() {return nazwisko; }
    public double getSaldo() { return saldo; }
    public void setId(int id) { this.id = id; }
    public int getId() { return id; }
}
