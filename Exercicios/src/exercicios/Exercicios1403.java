/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicios;

/**
 *
 * @author Davi
 */
public class Exercicios1403 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Exercícios com operadores de bits
        int a = 75, b = 47, c = 118, d = 82;
        int e, f, g;
        e = a | b & c;
        f = a ^b | d & c;
        g = a & b ^ c | d ^ e & f;
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
    }
    
}
