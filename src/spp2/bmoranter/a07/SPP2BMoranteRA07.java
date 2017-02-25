/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.bmoranter.a07;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author Benito Mv
 */
public class SPP2BMoranteRA07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Long [] directorio = new Long [10];
    for (int i=0; i<directorio. length; i++){
        directorio [i] = tel("el número telefónico "+ (i+1));
    }
    int consulta = consult("el número que desea consultar.");
    System.out.println("El número de la persona "+consulta+" es: " + directorio[consulta]);
    }
    
    public static long tel(String mensaje){
        Scanner kb = new Scanner (System.in);
        long varEntera = 0;
        boolean flag;
        
        do{
        System.out.println("Introduzca " + mensaje);
        try{
        varEntera = kb.nextLong();
        flag=false;
        }
        catch (Exception ex){
            System.out.println("Por favor introduzca un número válido");
            flag=true;
            kb.next();
        } 
        }while (flag); 
    return varEntera;
    }
    public static int consult(String mensaje){
        Scanner kb = new Scanner (System.in);
        int varEntera = 0;
        boolean flag;
        
        do{
        System.out.println("Introduzca " + mensaje);
        try{
        varEntera = kb.nextInt();
        flag=false;
    }catch (Exception ex){
            System.out.println("Introdujo una variable incorrecta " + ex);
            flag=true;
            kb.nextLine();
    } 
  } while (flag); 
    return varEntera;}
}

    
      
