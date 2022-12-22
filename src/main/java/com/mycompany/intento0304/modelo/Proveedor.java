/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.intento0304.modelo;

/**
 *
 * @author Jonna
 */
public class Proveedor {

    private int cedula;
    private String nombre;
    private String ruta;
    private String horaIngreso;
    private String horaSalida;
    private Pedido codigoPedido;

    public Proveedor(int cedula, String nombre, String ruta, String horaIngreso, String horaSalida, Pedido codigoPedido) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.ruta = ruta;
        this.horaIngreso = horaIngreso;
        this.horaSalida = horaSalida;
        this.codigoPedido = codigoPedido;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public String getHoraIngreso() {
        return horaIngreso;
    }

    public void setHoraIngreso(String horaIngreso) {
        this.horaIngreso = horaIngreso;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    public Pedido getCodigoPedido() {
        return codigoPedido;
    }

    public void setCodigoPedido(Pedido codigoPedido) {
        this.codigoPedido = codigoPedido;
    }

    @Override
    public String toString() {
        return "Proveedor{" + "cedula=" + cedula + ", nombre=" + nombre + ", ruta=" + ruta + ", horaIngreso=" + horaIngreso + ", horaSalida=" + horaSalida + ", codigoPedido=" + codigoPedido + '}';
    }
    
    

}
