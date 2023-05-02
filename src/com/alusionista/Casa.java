package com.alusionista;

public final class Casa extends Imovel {
    private String nomeEdificio;
    private int areaInterna;
    public Casa() {
        super();
        this.nomeEdificio = "";
        this.areaInterna = 0;
    }

    public Casa(String nomeEdificio, int areaInterna, String tipoMaterial, int valorAluguel, Endereco endereco, Proprietario proprietario) {
        this.nomeEdificio = nomeEdificio;
        this.areaInterna = areaInterna;
        this.setTipoMaterial(tipoMaterial);
        this.setValorAluguel(valorAluguel);
        this.setEndereco(endereco);
        this.setProprietario(proprietario);
    }

    public String getNomeEdificio() {
        return nomeEdificio;
    }

    public void setNomeEdificio(String nomeEdificio) {
        this.nomeEdificio = nomeEdificio;
    }

    public int getAreaInterna() {
        return areaInterna;
    }

    public void setAreaInterna(int areaInterna) {
        this.areaInterna = areaInterna;
    }
}
