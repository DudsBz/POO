/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orientacaoobjeto;

/**
 *
 * @author braze
 */
public class ExString {
    public static void main(String[] args)
    {
        String exemplo = "IFSP Capivari";
        
        //Imprimir a string em letra maiúscula
        System.out.println(exemplo.toUpperCase());
        
        //Imprimir a string em letra minúscula
        System.out.println(exemplo.toLowerCase());
        
        //comparar duas strings
        System.out.println(exemplo.equals("IFSP"));
        
        //comparar duas strings ignorando MAIUSCULAS E MINUSCULAS
        System.out.println(exemplo.equalsIgnoreCase("ifsp Capivari"));
        
        //o tamanho (qtde de caracteres) da String
        System.out.println(exemplo.length());
        
        //verificar se uma "sobstring" está contida na string
        System.out.println(exemplo.contains("ap"));
        System.out.println(!exemplo.contains("pi"));
        
        //pegar parte da string (sbstring)
        System.out.println(exemplo.substring(0, 4));
        
        //pegar o caractere de uma determinada posição
        System.out.println(exemplo.charAt(9));

        //substituir um caractere por outro
        System.out.println(exemplo.replaceAll("a", "x"));
    }
    
}
