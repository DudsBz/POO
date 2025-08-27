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
public class numeroPrimo {
    public static void main(String[] args){
        ///Aula do dia 26/08/2025
        //Faça com que o usuário digite um número e verifique se o número é primo
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = Integer.parseInt(scan.nextLine());
        boolean primo = true;
        
        for(int i = 2; i < numero; i++){
            if(numero % i == 0)
            {
                primo = false;
                break;
            }
        }
        if(primo)
        {
            System.out.println("É Primo");
        }else{
            System.out.println("Não é primo");
        }
        
        
    }
}
