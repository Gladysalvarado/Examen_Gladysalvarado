package com.corenetworks.modelo;

public class Paquete {
//*1. Atributos
    private String ipOrigen;
    private String ipDestino;

    private String mensaje;
    private int contadorpaquetes;

    //*2.Metodos

    public  int calcularNumPalabras(String saludo){
        String[] palabras = saludo.split("hola");
        return palabras.length;

    }
    //*3. Constructores
    public Paquete() {

    }

    public Paquete(String ipOrigen, String ipDestino, String mensaje, int contadorpaquetes) {
        this.ipOrigen = ipOrigen;
        this.ipDestino = ipDestino;
        this.mensaje = mensaje;
        this.contadorpaquetes = contadorpaquetes;
    }
//*4.Setters and Getters
    public String getIpOrigen() {
        return ipOrigen;
    }

    public void setIpOrigen(String ipOrigen) {
        this.ipOrigen = ipOrigen;
    }

    public String getIpDestino() {
        return ipDestino;
    }

    public void setIpDestino(String ipDestino) {
        this.ipDestino = ipDestino;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public int getContadorpaquetes() {
        return contadorpaquetes;
    }

    public void setContadorpaquetes(int contadorpaquetes) {
        this.contadorpaquetes = contadorpaquetes;
    }
}
