package com.s29101.Bank;

public class ReturnInfoObject {
    private int statusCode;
    private double noweSaldo;

    public ReturnInfoObject(int code, double saldo)
    {
        statusCode = code;  // 0 = ACCEPTED, wszystkie inne to declined z różnych powodów
        noweSaldo = saldo;
    }

    public int getStatusCode() { return statusCode; }
    public double getNoweSaldo() { return noweSaldo; }
}
