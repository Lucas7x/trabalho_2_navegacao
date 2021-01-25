package com.lucas7x.trabalho_2.model;

import java.io.Serializable;

public class Heroi implements Serializable {

    private String nomeHeroi, nomeComum, poder;

    public Heroi(String nomeComum, String nomeHeroi, String poder) {
        this.nomeHeroi = nomeHeroi;
        this.nomeComum = nomeComum;
        this.poder = poder;
    }

    public String getNomeHeroi() {
        return nomeHeroi;
    }

    public void setNomeHeroi(String nomeHeroi) {
        this.nomeHeroi = nomeHeroi;
    }

    public String getNomeComum() {
        return nomeComum;
    }

    public void setNomeComum(String nomeComum) {
        this.nomeComum = nomeComum;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public String toString() {
        return "Heroi: " + this.getNomeHeroi() + ";\nNome: " + this.getNomeComum() + ";\nPoder: " + this.getPoder();
    }
}
