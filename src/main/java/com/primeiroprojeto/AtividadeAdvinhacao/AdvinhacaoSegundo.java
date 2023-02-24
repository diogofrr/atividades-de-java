package com.primeiroprojeto.AtividadeAdvinhacao;

import java.util.Scanner;
import java.util.Random;

public class AdvinhacaoSegundo {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Random generator = new Random();
        
        int randNum = generator.nextInt(26);
        int userNum = 26;
        int nTentativas = 0;
                
        do {
            nTentativas++;
            System.out.println("Digite um número entre 0 e 25: ");
            userNum = input.nextInt();
        } while(userNum != randNum );
        
        System.out.printf("Parabéns! Você acertou com um total de %d tentativas!!", nTentativas);
    }
}
