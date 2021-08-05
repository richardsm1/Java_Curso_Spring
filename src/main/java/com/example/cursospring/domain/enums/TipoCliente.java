package com.example.cursospring.domain.enums;

public enum TipoCliente {
    PESSOAFISICA(1, "Pesssoa Física"),
    PESSOAJURIDICA(2, "Pessoa Jurídica");

    private final int cod;
    private final String descricao;

    TipoCliente(int cod, String descricao) {
        this.cod = cod;
        this.descricao = descricao;
    }

    public static TipoCliente toEnum(Integer cod) {
        if (cod == null) {
            return null;
        }

        for (TipoCliente x : TipoCliente.values()) {
            if (cod.equals(x.getCod())) {
                return x;
            }
        }

        throw new IllegalArgumentException("Id inválido: " + cod);
    }

    public int getCod() {
        return cod;
    }

    public String getDescricao() {
        return descricao;
    }
}
