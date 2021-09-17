/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manejadores;

import javax.swing.JTextArea;

/**
 *
 * @author dell
 */
public class Tokens {
   
    int estado=0;
    
    public Tokens(){
        
    }
    
    public void analizador(JTextArea tex){
        
        String todoTexto =tex.getText();
        String textoLimpio="";
        
        for(int i=0; i<todoTexto.length();i++){
            
            char letra=todoTexto.charAt(i);
            
            switch (letra) {
                // limpiar el texto
                case '\r':
                case '\t':
                case '\n':
                case '\b':
                case '\f':
                    
                    break;
                default:
                    //estamos concatenado el textolimpio con la letra que viene
                     textoLimpio=textoLimpio+letra;
                     System.out.println(textoLimpio);
            }
            
        }
        
         
        for(int i=0; i<textoLimpio.length();i++){
        
            char letra=textoLimpio.charAt(i);
            
            switch (estado) {
                case 0:
                    if(Character.isLetter(letra)){
                        
                    }
                    else if (Character.isDigit(letra))
                    {
                    
                    }
                    
                    break;
                default:
                    throw new AssertionError();
            }
            
        }
        
        
    }
}