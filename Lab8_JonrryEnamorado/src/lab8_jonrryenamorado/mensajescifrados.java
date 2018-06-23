/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_jonrryenamorado;

import java.util.ArrayList;

/**
 *
 * @author wende
 */
public class mensajescifrados {
    private String destino;
    private String fuente;
    boolean cifrado;
    private ArrayList<letras> frecuencia = new ArrayList();
    private String mensaje;

    public mensajescifrados(String destino, String fuente, boolean cifrado) {
        this.destino = destino;
        this.fuente = fuente;
        this.cifrado = cifrado;
    }

    public mensajescifrados() {
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public mensajescifrados(String destino, String fuente, boolean cifrado, String mensaje) {
        this.destino = destino;
        this.fuente = fuente;
        this.cifrado = cifrado;
        this.mensaje = mensaje;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
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

    public ArrayList getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(ArrayList frecuencia) {
        this.frecuencia = frecuencia;
    }

    @Override
    public String toString() {
        return "mensajescifrados{" + "frecuencia=" + frecuencia + '}';
    }
    
    
}
