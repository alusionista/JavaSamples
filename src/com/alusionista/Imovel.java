package com.alusionista;

public abstract class Imovel {
    private String tipoMaterial;
    private int valorAluguel;
    private Endereco endereco;
    private Proprietario proprietario;

    public Imovel() {
        this.tipoMaterial = "";
        this.valorAluguel = 0;
        this.endereco = new Endereco();
        this.proprietario = new Proprietario();
    }

    public Imovel(String tipoMaterial, int valorAluguel, Endereco endereco, Proprietario proprietario) {
        this.tipoMaterial = tipoMaterial;
        this.valorAluguel = valorAluguel;
        this.endereco = endereco;
        this.proprietario = proprietario;
    }

    public String getTipoMaterial() {
        return tipoMaterial;
    }

    public void setTipoMaterial(String tipoMaterial) {
        this.tipoMaterial = tipoMaterial;
    }

    public int getValorAluguel() {
        return valorAluguel;
    }

    public void setValorAluguel(int valorAluguel) {
        this.valorAluguel = valorAluguel;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
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
