package Classes;

import java.io.*;
import java.lang.*;
import java.util.*;
import javax.swing.*;
/**
 *
 * @author DEll
 */
public class Archivo {
     File archivo;
      // ArrayList<ConchinitoDigital> arrConDig=new ArrayList<ConchinitoDigital>();
     
    public Archivo(){
       
     archivo= new File("archivo.txt");
    }
    
    public void nuevoArchivo(){
    
    }

     public void escritura(ConchinitoDigital con){
           //escritura
           try{
               PrintWriter escribo=new PrintWriter(new BufferedWriter(new FileWriter(archivo)));
               escribo.println(con);
               escribo.close();
           }catch(IOException ex){
               JOptionPane.showMessageDialog(null,"Crea un usuario en (Nueva Alcancia)");
           }
     }  
     
      public String lectura(){//lectura
            
           try{
               BufferedReader leer = new BufferedReader(new FileReader(archivo));
               String cadena=leer.readLine();
               leer.close();
               return cadena;
           }catch(IOException e){
              JOptionPane.showMessageDialog(null,"Crea un usuario en (Nueva Alcancia)");
              return "";
           }
          }
         
            public boolean lecturaBolean(){//lectura
            
           try{
               BufferedReader leer = new BufferedReader(new FileReader(archivo));
               
               return true;
           }catch(IOException e){
              JOptionPane.showMessageDialog(null,"Crea un usuario en (Nueva Alcancia)");
              return false;
           }
           
         }     
  
           
}
