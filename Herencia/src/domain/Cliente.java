/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.Date;

/**
 *
 * @author JOSE
 */
public class Cliente extends Persona{
    private int idCliente;
    private Date fechaRegistro;
    private boolean vip;
    private static int contadorCliente;
    
    public Cliente(Date fechaRegistro,boolean vip,String nombre, char genero, int edad, String direccion){
        super(nombre, genero, edad, direccion);
        //agrego el constructor de la clase hija
        this.idCliente = ++Cliente.contadorCliente;
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
        
    }

    public Cliente(Date date, boolean b, String karla, String f) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getIdCliente() {
        return idCliente;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public static int getContadorCliente() {
        return contadorCliente;
    }

    public static void setContadorCliente(int contadorCliente) {
        Cliente.contadorCliente = contadorCliente;
    }

    @Override
    public String toString() {
       StringBuilder sb = new StringBuilder();
       sb.append(" id cliente = ").append(idCliente);
       sb.append(", fecha registro= ").append(fechaRegistro);
       sb.append(", vib = ").append(vip);
       sb.append(", ").append(super.toString());
       sb.append("}");
       return sb.toString();       
    }
    
}
