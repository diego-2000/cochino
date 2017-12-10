package Classes;

import java.io.*;
import java.lang.*;
import java.util.*;
import javax.swing.*;
/**
 *
 * @author DEll
 */
public class ConchinitoDigital {
    private int peso;
    private int dosPesos;
    private int cincoPesos;
    private int diesPesos;
    private int cincuentaCentavos;
    private String fechaInicio;
    private Usuario usuario1;
    
    
    public ConchinitoDigital(){
    this.peso=0;
    this.dosPesos=0;
    this.cincoPesos=0;
    this.diesPesos=0;
    this.cincuentaCentavos=0;
    fechaInicio="00/00/0000";
    usuario1=new Usuario();
    }
    
    public void GuardarPropietario(Usuario usu){
    usuario1.setNombre(usu.getNombre());
    usuario1.setAppPaterno(usu.getAppPaterno());
    }
    public void ContarCantidadDenominacion(){
            
    }
    
    public float CalcularTotalAhorrado(){//da el total del ahorro
    float TotalAhorrado=(float)(cincuentaCentavos*0.5+peso*1+dosPesos*2+cincoPesos*5+diesPesos*10);
    return TotalAhorrado;       
         
    }
    
    public float RomperCochinito(){//inicializa cantidades y da el total
    float cant=CalcularTotalAhorrado();
    peso=0;
    dosPesos=0;
    cincoPesos=0;
    diesPesos=0;
    cincuentaCentavos=0;
    fechaInicio="00/00/0000";
    return cant;
    }
    
    public void NuevaAlcancia(Usuario usu){
    usuario1.setNombre(usu.getNombre());
    usuario1.setAppPaterno(usu.getAppPaterno());
    this.peso=0;
    this.dosPesos=0;
    this.cincoPesos=0;
    this.diesPesos=0;
    this.cincuentaCentavos=0;
    }
    
    @Override
    public String toString(){
    return ""+this.cincuentaCentavos+","+this.peso+","+this.dosPesos+","
             +this.cincoPesos+","+this.diesPesos+","+usuario1.toString()+","+fechaInicio;
    }

    public int getPeso() {
        return peso;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Usuario getUsuario1() {
        return usuario1;
    }

    public void setUsuario1(Usuario usuario1) {
        this.usuario1 = usuario1;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getDosPesos() {
        return dosPesos;
    }

    public void setDosPesos(int dosPesos) {
        this.dosPesos = dosPesos;
    }

    public int getCincoPesos() {
        return cincoPesos;
    }

    public void setCincoPesos(int cincoPesos) {
        this.cincoPesos = cincoPesos;
    }

    public int getDiesPesos() {
        return diesPesos;
    }

    public void setDiesPesos(int diesPesos) {
        this.diesPesos = diesPesos;
    }

    public int getCincuentaCentavos() {
        return cincuentaCentavos;
    }

    public void setCincuentaCentavos(int cincuentaCentavos) {
        this.cincuentaCentavos = cincuentaCentavos;
    }
    
}
    
