/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orientacaoobjeto;

import java.util.Scanner;

/**
 *
 * @author braze
 */
public class Invertido {
    public static void main(String[] args)
    {
        System.out.println("Digita uma palavra: ");
        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine();
        int tamanho = string.length();
        String invertida = "";
        for(int i = tamanho-1; i >= 0; i--){
            invertida += String.valueOf(string.charAt(i));
        }
        System.out.println(invertida);
        
    }
    
}
