package com.alusionista;

public class Endereco {
    private String rua;
    private int num;
    private Cidade cidade;

    public Endereco() {
        this.rua = "";
        this.num = 0;
        this.cidade = new Cidade();
    }

    public Endereco(String rua, int num, Cidade cidade) {
        this.rua = rua;
        this.num = num;
        this.cidade = cidade;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public int getCodCid() {
        return this.cidade.getCodCid();
    }

    public void setCodCid(int codCid) {
        this.cidade.setCodCid(codCid);
    }

    public String getNomeCid() {
        return this.cidade.getNomeCid();
    }

    public void setNomeCid(String nomeCid) {
        this.cidade.setNomeCid(nomeCid);
    }
}
