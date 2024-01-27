package com.s29101.Bank;


public class User {
    int id;
    private double saldo;
    public User(int ID, double SALDO) { id = ID; saldo = SALDO; }
    public void addSaldo(double dodaneSaldo) { this.saldo += dodaneSaldo; }
    public void setSaldo(double ustawioneSaldo) { this.saldo = ustawioneSaldo; }
    public double getSaldo() { return saldo; }
    public void setId(int id) { this.id = id; }
    public int getId() { return id; }
}
