package com.primeiroprojeto.AtividadeAdvinhacao;

import java.util.Scanner;
import java.util.Random;

public class AdvinhacaoTerceira {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Random generator = new Random();
        
        int randNum = generator.nextInt(26);
        int userNum = 26;
        int nTentativas = 1;
                
        do {
            System.out.printf("Total de tentativas: %d \n", nTentativas);
            System.out.println("Digite um número entre 0 e 25: ");
            userNum = input.nextInt();
            
            System.out.println("----------------------------------------------");
            
            if(nTentativas == 3){
                System.out.println("Você excedeu o número de tentativas. O número correto é " + randNum);
                break;
            } else{
                if(randNum == userNum){
                    System.out.printf("Parabéns! Você acertou com um total de %d tentativas!!", nTentativas);
                }else {
                    nTentativas++;
                }
            }
        } while(userNum != randNum);
    }
}
