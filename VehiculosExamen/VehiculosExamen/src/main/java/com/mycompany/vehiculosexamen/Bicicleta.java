/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vehiculosexamen;

/**
 *
 * @author alejandro.romero1
 */

public class Bicicleta extends Vehiculo {
    public Bicicleta(String marca, String modelo, int anio, double velocidadMaxima) throws VelocidadInvalidaException {
        super(marca, modelo, anio, velocidadMaxima);
    }
    @Override
    public void arrancar() {
        System.out.println("La bicicleta comienza a pedalear");
    }
}
