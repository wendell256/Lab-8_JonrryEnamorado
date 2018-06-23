/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_jonrryenamorado;

/**
 *
 * @author wende
 */
public class letras {
    private String letra;
    private int number;

    public letras() {
    }

    public letras(String letra, int number) {
        this.letra = letra;
        this.number = number;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return letra + "-->" +  number;
    }
    
    
}
