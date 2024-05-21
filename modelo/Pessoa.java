package org.example.modelo;

import org.example.recursos.Input;

import java.util.Objects;

public class Pessoa {
    private String nome;
    private String cpf;
    private Sexo sexo;

    public Pessoa(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pessoa pessoa)) return false;
        return Objects.equals(nome, pessoa.nome) && Objects.equals(cpf, pessoa.cpf) && Objects.equals(sexo, pessoa.sexo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cpf, sexo);
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", sexo=" + sexo +
                '}';
    }

    public static Pessoa lerPessoa(){
        Pessoa pessoa = new Pessoa();

        System.out.println("Criando nova pessoa...");

        System.out.print("Nome:");
        pessoa.setNome(Input.scan.nextLine());

        System.out.print("CPF: ");
        pessoa.setCpf(Input.scan.nextLine());

        System.out.print("Sexo[M/F]: ");
        String charSexo = Input.scan.next();
        Input.scan.nextLine();

        while (!(charSexo.equalsIgnoreCase("M")
                || charSexo.equalsIgnoreCase("F"))){

            System.out.println("Sexo Invalído, use [M] ou [F]");
            System.out.print("Sexo: ");
            charSexo = Input.scan.next();
            Input.scan.nextLine();
        }

        for(Sexo sexo: Sexo.values()){
            if(sexo.getCharSexo().equalsIgnoreCase(charSexo)){
                pessoa.setSexo(sexo);
            }
        }


        return pessoa;
    }
}
