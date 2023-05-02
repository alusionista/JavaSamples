package com.alusionista;

import java.util.Date;

public class Locacao {
    private Date dataInicio;
    private Date dataFim;
    private Casa casa;
    private Apartamento apartamento;

    public Locacao() {
        this.dataFim = new Date();
        this.dataInicio = new Date();
        this.casa = new Casa();
        this.apartamento = new Apartamento();
    }

    public Locacao(Date dataInicio, Date dataFim, Casa casa, Apartamento apartamento) {
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        if (casa != null){
            this.casa = casa;
        }
        if (apartamento != null) {
            this.apartamento = apartamento;
        }
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public Casa getCasa() {
        return casa;
    }

    public void setCasa(Casa casa) {
        this.casa = casa;
    }

    public Apartamento getApartamento() {
        return apartamento;
    }

    public void setApartamento(Apartamento apartamento) {
        this.apartamento = apartamento;
    }
}
