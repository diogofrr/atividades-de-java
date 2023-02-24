package com.primeiroprojeto.PrimeiroProjeto;
import java.util.Scanner;

public class MediaJava {
    public static void main(String[] args){
        float nota1, nota2, nota3, nota4, resultado;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Insira sua 1ª nota: ");
        nota1 = input.nextFloat();
        
        System.out.println("Insira sua 2ª nota: ");
        nota2 = input.nextFloat();
        
        System.out.println("Insira sua 3ª nota: ");
        nota3 = input.nextFloat();
        
        System.out.println("Insira sua 4ª nota: ");
        nota4 = input.nextFloat();
        resultado = ((nota1 + nota2 + nota3 + nota4)/4);
        
        System.out.println("---------------------");
        
        if((resultado >= 0) && (resultado <= 10)){
            System.out.printf("Média: %.2f\n", resultado);
            
            if (resultado < 5){
                System.out.println("Reprovado"); 
            } else {   
                if (resultado > 7) {
                    System.out.println("Aprovado");
                } else {
                    System.out.println("Recuperação");
                }
            }
        } else {
            System.out.println("Valor de média inválido.");
        }
    }
}
