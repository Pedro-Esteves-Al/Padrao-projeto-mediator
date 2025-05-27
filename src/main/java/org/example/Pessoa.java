package org.example;

public class Pessoa {
    public String realizarDenunciaAnonima(String mensagem) {
        return DivisaoDenuncia.getInstancia().receberDenunciaAnonima(mensagem);
    }
    public String realizarDenunciaIdentificada(String mensagem) {
        return DivisaoDenuncia.getInstancia().receberDenunciaIdentificada(mensagem);
    }
}
