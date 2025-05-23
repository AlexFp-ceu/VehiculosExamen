/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vehiculosexamen;

/**
 *
 * @author alejandro.romero1
 */

public abstract class Vehiculo {
    private String marca;
    private String modelo;
    private int anio;
    private double velocidadMaxima;

    public Vehiculo(String marca, String modelo, int anio, double velocidadMaxima) throws VelocidadInvalidaException {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        setVelocidadMaxima(velocidadMaxima);
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getAnio() {
        return anio;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }
    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }
    public void setVelocidadMaxima(double velocidadMaxima) throws VelocidadInvalidaException {
        if (velocidadMaxima <= 0) {
            throw new VelocidadInvalidaException("La velocidad máxima debe ser mayor que cero.");
        }
        this.velocidadMaxima = velocidadMaxima;
    }

    public abstract void arrancar();

    @Override
    public String toString() {
        return String.format("%s %s (%d) - Velocidad Máxima: %.2f km/h", marca, modelo, anio, velocidadMaxima);
    }
}
