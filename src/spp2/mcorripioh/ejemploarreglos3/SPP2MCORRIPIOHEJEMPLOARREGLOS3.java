/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.mcorripioh.ejemploarreglos3;
import java.util.Scanner;

/**
 *
 * @author MayteCorripio
 */
public class SPP2MCORRIPIOHEJEMPLOARREGLOS3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] myArray= new int [4][4];
        for (int i=0; i<myArray.length; i++){
            for(int j=0; j<myArray[i].length; j++){
                myArray[i][j]= solicitaEntero();
            }
    }
        System.out.println("Numeros");
        for(int i=0; i<myArray.length; i++){
        for (int j=0; j<myArray.length; j++){
            System.out.println("["+myArray[i][j]+"]");
        }
            System.out.println();
        }
        
    }
    public static int solicitaEntero(){
        Scanner kb= new Scanner (System.in);
        boolean flag;
        int n=0;
        do{
            System.out.println("Introduce un número entero");
            try{
                n =kb.nextInt();
                flag = false;
            }catch (Exception er){
                System.out.println("Vuelve a intentarlo");
                flag = true;
                kb.nextInt();
            }
           
        }while(flag);
        return n;
    }
}