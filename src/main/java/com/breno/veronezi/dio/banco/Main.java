package com.breno.veronezi.dio.banco;

public class Main {

    public static void main(String[] args) {
        Cliente breno = new Cliente();
        breno.setNome("Breno Donato Veronezi");
        Conta cc = new ContaCorrente(breno);
        Conta poupanca = new ContaPoupanca(breno);
        Conta ci = new ContaInvestimento(breno);

        cc.depositar(100);
        cc.transferir(100, poupanca);
        ci.investir(100, "DogeCoin");

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
        ci.imprimirExtrato();
    }
}
