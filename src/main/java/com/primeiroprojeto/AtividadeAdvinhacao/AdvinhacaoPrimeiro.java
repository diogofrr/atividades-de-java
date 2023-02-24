package com.primeiroprojeto.AtividadeAdvinhacao;

import java.util.Scanner;
import java.util.Random;

public class AdvinhacaoPrimeiro {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Random generator = new Random();
        
        int randNum = generator.nextInt(26);
        int userNum = 26;
        
        while(userNum != randNum ){
            System.out.println("Digite um número entre 0 e 25: ");
            userNum = input.nextInt();
        }
        
        System.out.println("Parabéns! Você acertou.");
    }
}
