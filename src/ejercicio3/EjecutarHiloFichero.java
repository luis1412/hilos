/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author luish
 */
public class EjecutarHiloFichero {

    public static void main(String[] args) throws InterruptedException {

        File archivo1 = new File("./fichero1.txt");
        File archivo2 = new File("./fichero2.txt");
        File archivo3 = new File("./fichero3.txt");
        File archivo4 = new File("./fichero4.txt");

        ArrayList<File> listaFicheros = new ArrayList();
        listaFicheros.add(archivo1);
        listaFicheros.add(archivo2);
        listaFicheros.add(archivo3);
        listaFicheros.add(archivo4);
        
        int contadorHilo = 1;
        
        for (File fichero : listaFicheros) {
            ContadorCaracteres contador = new ContadorCaracteres();
            contador.setArchivo(fichero);
            contador.contadorHilo = contadorHilo;
            contador.start();
            contadorHilo++;
         }

       


    }
}
