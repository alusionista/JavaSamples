package com.alusionista;

public class Proprietario {
    private int cpf_Prop;
    private String nome_Prop;
    private Endereco endereco;

    public Proprietario() {
        this.cpf_Prop = 0;
        this.nome_Prop = "";
        this.endereco = new Endereco();
    }

    public Proprietario(int cpf_Prop, String nome_Prop, Endereco endereco) {
        this.cpf_Prop = cpf_Prop;
        this.nome_Prop = nome_Prop;
        this.endereco = endereco;
    }

    public int getCpf_Prop() {
        return cpf_Prop;
    }

    public void setCpf_Prop(int cpf_Prop) {
        this.cpf_Prop = cpf_Prop;
    }

    public String getNome_Prop() {
        return nome_Prop;
    }

    public void setNome_Prop(String nome_Prop) {
        this.nome_Prop = nome_Prop;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getRua() {
        return this.endereco.getRua();
    }

    public void setRua(String rua) {
        this.endereco.setRua(rua);
    }

    public int getNum() {
        return this.endereco.getNum();
    }

    public void setNum(int num) {
        this.endereco.setNum(num);
    }

    public Cidade getCidade() {
        return this.endereco.getCidade();
    }

    public void setCidade(Cidade cidade) {
        this.endereco.setCidade(cidade);
    }

    public int getCodCid() {
        return this.endereco.getCodCid();
    }

    public void setCodCid(int codCid) {
        this.endereco.setCodCid(codCid);
    }

    public String getNomeCid() {
        return this.endereco.getNomeCid();
    }

    public void setNomeCid(String nomeCid) {
        this.endereco.setNomeCid(nomeCid);
    }
}
