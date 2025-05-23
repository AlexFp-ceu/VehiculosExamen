/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vehiculosexamen;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alejandro.romero1
 */
public class VehiculosExamen {

    public static void main(String[] args) {
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        try {
            vehiculos.add(new Coche("Toyota", "Corolla", 2020, 180));
            vehiculos.add(new Moto("Yamaha", "Ls33", 2022, 210));
            vehiculos.add(new Bicicleta("Orbea", "MX40", 2021, 35));
            vehiculos.add(new Camion("Volvo", "FH16", 2019, 140));
            vehiculos.add(new Patinete("Xiaomi", "Mi Electric", 2023, 25));
        } catch (VelocidadInvalidaException e) {
            System.out.println("Error al crear un vehículo: " + e.getMessage());
        }

        Scanner scanner = new Scanner(System.in);
        int opcion = -1;
        while (opcion != 0) {
            System.out.println("\n--- MENÚ DE VEHÍCULOS ---");
            for (int i = 0; i < vehiculos.size(); i++) {
                System.out.printf("%d. %s\n", i + 1, vehiculos.get(i).getClass().getSimpleName());
            }
            System.out.println("0. Salir");
            System.out.print("Seleccione el número del vehículo para ver información: ");
            try {
                opcion = Integer.parseInt(scanner.nextLine());
                if (opcion > 0 && opcion <= vehiculos.size()) {
                    Vehiculo v = vehiculos.get(opcion - 1);
                    System.out.println("\nInformación del vehículo:");
                    System.out.println(v);
                    v.arrancar();
                } else if (opcion != 0) {
                    System.out.println("Opción no válida.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Por favor, introduzca un número válido.");
            }
        }
        scanner.close();
        System.out.println("Programa finalizado.");
    }
}
