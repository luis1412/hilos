/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author luish
 */
public class ContadorCaracteres extends Thread{
    File archivo;
    public int totalCaracteres = 0;
    public long tiempoTotal = 0;
    public void setArchivo(File file){
        this.archivo = file;
    }
    
    public int contadorHilo;
    
    
    @Override
    public void run() {
        long tiempoComienzo, tiempoFin;
        
        tiempoComienzo = System.currentTimeMillis();
        
        try {
        BufferedReader bf = new BufferedReader(new FileReader(archivo));
        
        String linea;
        while((linea = bf.readLine()) != null){
            totalCaracteres += linea.length();
        }
        tiempoTotal = System.currentTimeMillis() - tiempoComienzo;
        bf.close();
        
        } catch (IOException e) {
            System.out.println("Error con el fichero");
        }
        finally{
            System.out.println("Total Caracteres del hilo: " + contadorHilo +  " es: " + totalCaracteres);
            System.out.println("El proceso ha tardado " + tiempoTotal + " milisegundos");
        }
    }
 

      
        
    
    
}
