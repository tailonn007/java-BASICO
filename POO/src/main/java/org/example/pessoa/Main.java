package org.example.pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa(12,"Maria",52,"71981234052","maria11@gmail.com",Sexo.FEMININO,UnidadeFederativa.RIO_DE_JANEIRO);
        Pessoa pessoa2 = new Pessoa(21, "Jose",55,"71981400243","josedaxiba11@gmail.com",Sexo.MASCULINO,UnidadeFederativa.BAHIA);
        Pessoa pessoa3 = new Pessoa(11,"joão", 54,"7181400256","joaopedefeijao@gmail.com",Sexo.MASCULINO,UnidadeFederativa.SAO_PAULO);


        System.out.println(pessoa1.toString());
        System.out.println(pessoa2.toString());
        System.out.println(pessoa3.toString());
    }
}
