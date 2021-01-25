package com.lucas7x.trabalho_2.model;

import java.util.ArrayList;

public class ListaHeroi {
    private ArrayList<Heroi> lista = new ArrayList<Heroi>();
    private static ListaHeroi instancia;

    private ListaHeroi() {}

    public static synchronized ListaHeroi getInstance() {
        if(instancia == null) {
            instancia = new ListaHeroi();
        }
        return instancia;
    }

    public ArrayList<Heroi> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Heroi> lista) {
        this.lista = lista;
    }


    public void addHeroi(Heroi h) {
        lista.add(h);
    }

    public Heroi get(int i) {
        return lista.get(i);
    }

    public void set(int i, Heroi h) {
        lista.get(i).setNomeComum(h.getNomeComum());
        lista.get(i).setNomeHeroi(h.getNomeHeroi());
        lista.get(i).setPoder(h.getPoder());
    }

    public void editHeroi(int i, Heroi h) {
        lista.set(i, h);
    }



}

/*

public class Heroi implements Serializable {

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
        return "Nome de herói: " + this.getNomeHeroi() + "\nIdentidade secreta: " + this.getNomeComum() + "\nPoder: " + this.getPoder();
    }
}

 */