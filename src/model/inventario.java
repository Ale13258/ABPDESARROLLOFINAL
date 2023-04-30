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
     private String contactoCliente;
    private String EntregadoPor;
     private String NombreE;
     private String modelo;
     private String Estado;
     private String DiagnosticoEquipo;
    

    public Inventario(String RecibidoPor, String contactoCliente, String EntregadoPor, String NombreE, String modelo, String Estado, String DiagnosticoEquipo) {
        this.RecibidoPor = RecibidoPor;
        this.contactoCliente = contactoCliente;
        this.EntregadoPor = EntregadoPor;
        this.NombreE = NombreE;
        this.modelo = modelo;
        this.Estado = Estado;
        this.DiagnosticoEquipo = DiagnosticoEquipo;
    }


     
    
    
    
    
   public Inventario(){
       
       
   }

    public String getRecibidoPor() {
        return RecibidoPor;
    }

    public void setRecibidoPor(String RecibidoPor) {
        this.RecibidoPor = RecibidoPor;
    }

    public String getContactoCliente() {
        return contactoCliente;
    }

    public void setContactoCliente(String contactoCliente) {
        this.contactoCliente = contactoCliente;
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
        return DiagnosticoEquipo;
    }

    public void setDiagnosticoEquipo(String DiagnosticoEquipo) {
        this.DiagnosticoEquipo = DiagnosticoEquipo;
    }
                public String getNombreE() {
        return NombreE;
    }

    public void setNombreE(String NombreE) {
        this.NombreE = NombreE;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}

