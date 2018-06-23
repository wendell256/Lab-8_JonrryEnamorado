/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_jonrryenamorado;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author wende
 */
public class mensajes implements Serializable {
    private ArrayList<empleados> destino;
    private String fuente;
    boolean cifrado;
    private String mensaje;
    
     private static final long SerialVersonUID = 777L;

    public mensajes() {
    }

    public mensajes(ArrayList destino, String fuente, boolean cifrado) {
        this.destino = destino;
        this.fuente = fuente;
        this.cifrado = cifrado;
    }

    public mensajes(ArrayList destino, String fuente, boolean cifrado, String mensaje) {
        this.destino = destino;
        this.fuente = fuente;
        this.cifrado = cifrado;
        this.mensaje = mensaje;
    }
    
    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    

    public ArrayList getDestino() {
        return destino;
    }

    public void setDestino(ArrayList destino) {
        this.destino = destino;
    }

    public String getFuente() {
        return fuente;
    }

    public void setFuente(String fuente) {
        this.fuente = fuente;
    }

    public boolean isCifrado() {
        return cifrado;
    }

    public void setCifrado(boolean cifrado) {
        this.cifrado = cifrado;
    }

    @Override
    public String toString() {
        return  mensaje;
    }

    
    
    
    
}
