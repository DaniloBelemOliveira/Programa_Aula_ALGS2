package org.example.principal;

import org.example.modelo.Pessoa;
import org.example.recursos.Input;
import org.example.recursos.LimparTerminal;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();

        for(int i =0; i < 4; i++){
            LimparTerminal.limpar();
            System.out.println(" ");
            pessoas.add(Pessoa.lerPessoa());
        }

     // FECHAR BUFFER DA CLASSE INPUT USADA PARA DIMINUIR O GASTO DE RECURSOS
        Input.scan.close();

        System.out.println("\n====================================\n");
        imprimirTudo(pessoas);

        System.out.println("\nLista Filtrada por Sexo");
        System.out.println("====================================\n");

        List<Pessoa> pessoasFiltradas = pessoas
                .stream()
                .filter(pessoa -> pessoa.getSexo().getCharSexo().equals("F"))
                .toList();

        imprimirTudo(pessoasFiltradas);
    }

    static Consumer<Pessoa> print =
            pessoa -> System.out.println(pessoa.toString());

    public static void imprimirTudo(List<Pessoa> lista){
        lista.forEach(print);
    }

}