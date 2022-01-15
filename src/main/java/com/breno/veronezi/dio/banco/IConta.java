package com.breno.veronezi.dio.banco;

public interface IConta {

    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, Conta contaDestino);

    void investir(double valor, String Moeda);

    void imprimirExtrato();
}
