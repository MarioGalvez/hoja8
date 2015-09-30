/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoja8;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Mario Fernando
 */
public class Hoja8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
    }
    public static void LeerArchivo() throws FileNotFoundException, IOException{   
        //Aqui se coloca la direccion del Archivo completa 
        BufferedReader bf = new BufferedReader(new FileReader("C:\\Users\\Mario Fernando\\Desktop\\123.txt"));
        cadena=bf.readLine();         
      }
}
