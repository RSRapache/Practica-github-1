/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1github;
import java.util.*;
/**
 *
 * @author admin
 */
public class Practica1Github {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        
        String cadena ,caracter;
        
        System.out.println("Escriba la cadena");
        cadena=sc.nextLine();
        
        do{
        
            System.out.println("Escriba letra");
            caracter=sc.nextLine();
            
            caracter=caracter.substring(0, 1);
            
            
        }while(!Character.isLetter(caracter.charAt(0)));
        
        proceso_contador(cadena,caracter);
        
    }
    
    public static void proceso_contador(String cadena, String caracter){
        int cont=0;
        
        for(int i=0;i<cadena.length();i++){
            
            if(caracter.equalsIgnoreCase(cadena.substring(i, i+1)))
                cont++;
        }
        
        System.out.println(cont+" veces que sale la letra "+caracter+" en la cadena "+cadena);
    }
}
