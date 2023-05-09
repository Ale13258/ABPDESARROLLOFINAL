/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author aleja
 */
public class Inventario {

   
     private String RecibidoPor;
     private String ContactoCliente;
     private String EntregadoPor;
     private String NombreEquipo;
     private String Modelo;
     private String Estado;
     private String DiagnosticoEquipos;
    

    public Inventario(String RecibidoPor, String ContactoCliente, String EntregadoPor, String NombreE, String modelo, String Estado, String DiagnosticoEquipo) {
        this.RecibidoPor = RecibidoPor;
        this.ContactoCliente =ContactoCliente;
        this.EntregadoPor = EntregadoPor;
        this.NombreEquipo = NombreE;
        this.Modelo = modelo;
        this.Estado = Estado;
        this.DiagnosticoEquipos = DiagnosticoEquipo;
    }


     
    
    
    
    
   

    public String getRecibidoPor() {
        return RecibidoPor;
    }

    public void setRecibidoPor(String RecibidoPor) {
        this.RecibidoPor = RecibidoPor;
    }

    public String getContactoCliente() {
        return ContactoCliente;
    }

    public void setContactoCliente(String contactoCliente) {
        this.ContactoCliente = contactoCliente;
    }

    public String getEntregadoPor() {
        return EntregadoPor;
    }

    public void setEntregadoPor(String EntregadoPor) {
        this.EntregadoPor = EntregadoPor;
    }


    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getDiagnosticoEquipo() {
        return DiagnosticoEquipos;
    }

    public void setDiagnosticoEquipo(String DiagnosticoEquipo) {
        this.DiagnosticoEquipos = DiagnosticoEquipo;
    }
                public String getNombreE() {
        return NombreEquipo;
    }

    public void setNombreE(String NombreE) {
        this.NombreEquipo = NombreE;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        this.Modelo = modelo;
    }
}

