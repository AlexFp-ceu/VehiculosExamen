/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vehiculosexamen;

/**
 *
 * @author alejandro.romero1
 */

public class Camion extends Vehiculo {
    public Camion(String marca, String modelo, int anio, double velocidadMaxima) throws VelocidadInvalidaException {
        super(marca, modelo, anio, velocidadMaxima);
    }
    @Override
    public void arrancar() {
        System.out.println("El camión hace un ruido fuerte de motor");
    }
}
