package com.primeiroprojeto.PrimeiroProjeto;

import java.util.Scanner;

public class ScannerInput {
    public static void main(String[] args) {
        String seuNome;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite seu nome: ");
        seuNome = input.nextLine();
        
        System.out.println("Olá, " + seuNome + ".");
    }
}
