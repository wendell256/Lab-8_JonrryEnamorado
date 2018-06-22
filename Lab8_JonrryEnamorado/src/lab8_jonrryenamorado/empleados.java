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
public class empleados {
    private String name;
    private long id;
    private String pass;
    private empleados jefe;
    private long salario;
    private String puesto;
    ArrayList <empleados> listaempleados = new ArrayList();

    public empleados() {
    }

    public empleados(String name, long id, String pass, empleados jefe, long salario, String puesto) {
        this.name = name;
        this.id = id;
        this.pass = pass;
        this.jefe = jefe;
        this.salario = salario;
        this.puesto = puesto;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public empleados getJefe() {
        return jefe;
    }

    public void setJefe(empleados jefe) {
        this.jefe = jefe;
    }

    public long getSalario() {
        return salario;
    }

    public void setSalario(long salario) {
        this.salario = salario;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public ArrayList<empleados> getListaempleados() {
        return listaempleados;
    }

    public void setListaempleados(ArrayList<empleados> listaempleados) {
        this.listaempleados = listaempleados;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
