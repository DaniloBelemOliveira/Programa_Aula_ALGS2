package org.example.modelo;

public enum Sexo {
    MASCULINO("M"),
    FEMININO("F");

    private final String sexo;

    Sexo(String sexo){
        this.sexo = sexo;
    }

    public String getCharSexo() {
        return sexo;
    }
}
