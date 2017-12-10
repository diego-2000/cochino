package Classes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DEll
 */
public class Usuario {
    private String nombre;
    private String appPaterno;
 //   private String appMaterno;
    
    public Usuario(String nombre,String appePat){
    this.nombre=nombre;
    this.appPaterno=appePat;
 //   this.appMaterno=appmater;
    }
    public Usuario(){
    this.nombre="nombre";
    this.appPaterno="appePat";
 //   this.appMaterno="appmater";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAppPaterno() {
        return appPaterno;
    }

    public void setAppPaterno(String appPaterno) {
        this.appPaterno = appPaterno;
    }
    @Override
    public String toString(){
    return ""+nombre+","+appPaterno;
    }
}
