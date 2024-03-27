package com.springbatch.contasbancarias.dominio;

public enum Tipo {
    PRATA(500.0), OURO(1000.0), PLATINA(2500.0), DIAMANTE(5000.0);

    Tipo(double limite) {
        this.limite = limite;
    }

    private double limite;
    public Double getLimite() {
        return this.limite;
    }

    public static Tipo getTipo(Double salario) {
        if (salario <= 3000) {
            return Tipo.PRATA;
        }
        if (salario <= 5000) {
            return Tipo.OURO;
        }
        if (salario <= 10000) {
            return Tipo.PLATINA;
        }
        return Tipo.DIAMANTE;
    }
}
