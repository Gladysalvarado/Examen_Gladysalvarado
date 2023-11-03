package com.corenetworks.presentacion;

import com.corenetworks.modelo.Paquete;

import java.util.Scanner;

public class Mostrar_paquete {
    public static void main(String[] args) {

        String mensaje;
        Scanner teclado = new Scanner(System.in);
        String[] paquetes = new String[20];
        Paquete p1 = new Paquete();
        System.out.println("introduce ip origen -->");
        p1.setIpOrigen(teclado.nextLine());
        System.out.println("introduce ip destino -->");
        p1.setIpDestino(teclado.nextLine());
        System.out.println("introduce el mensaje ->");
        p1.setMensaje(teclado.nextLine());

       mensaje = p1.calcularNumPalabras(mensaje);
        System.out.println(mensaje);

//*int numeroPaquetes = longitudMesaje;

        String[] palabras = p1.getMensaje().split("hola");
        for (int i=0; i<20;i++){
            paquetes [i] = palabras[i];
            System.out.println();





        }

        }



}
