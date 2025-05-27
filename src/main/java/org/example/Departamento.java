package org.example;

public interface Departamento {
    String receberDenunciaAnonima(String mensagem);

    String receberDenunciaIdentificada(String mensagem);
}
