package com.example.singleton.entidades;

public class Carro {
   private String cor;
  private String modelo;
  private String marca;
   private Integer ang;



    public Carro(String cor, String modelo, String marca, Integer ang) {
        this.cor = cor;
        this.modelo = modelo;
        this.marca = marca;
        this.ang = ang;
    }

    public Carro() {
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getAng() {
        return ang;
    }

    public void setAng(Integer ang) {
        this.ang = ang;
    }
}
