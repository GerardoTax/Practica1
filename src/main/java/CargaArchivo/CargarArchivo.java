/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CargaArchivo;

import Manejadores.BusquedaPalabras;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JTextArea;

/**
 *
 * @author dell
 */
public class CargarArchivo {
    public ArrayList<String > leerFichero(File archivo,JTextArea text) throws FileNotFoundException, IOException {
        ArrayList<String > lineas = new ArrayList<>();
        FileReader fr = new FileReader(archivo);
        BufferedReader br = new BufferedReader(fr);
        String linea;
        while ((linea = br.readLine()) != null) {
            //System.out.println(linea);
            
            text.append("\n"+linea);
        }
        fr.close(); 
        return lineas;
    }

}
