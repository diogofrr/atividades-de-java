package com.primeiroprojeto.AtividadeAdvinhacao;

import javax.swing.JOptionPane;

import java.util.Scanner;
import java.util.Random;

public class AdvinhacaoQuarta{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Random generator = new Random();
        
        JOptionPane gui = new JOptionPane();
        
        int randNum = generator.nextInt(10);
        int userNum = 11;
        String strUserNum;
        int nTentativas = 1;
                
        do {
            try {
                strUserNum = JOptionPane.showInputDialog("Tentativa: " + nTentativas + "\nDigite um valor entre 0 e 10: ");

                if(strUserNum == null){
                    break;
                }
                
                userNum = Integer.parseInt(strUserNum);
                
                if(userNum < 0 || userNum > 11){
                    throw new NumberFormatException();
                }
                
                if(nTentativas == 3){
                    JOptionPane.showMessageDialog(null, "Você excedeu o número de tentativas. O número correto é " + randNum);
                    break;
                } else{
                    if(randNum == userNum){
                        JOptionPane.showMessageDialog(null, "Parabéns! Você acertou com um total de " + nTentativas + " tentativas!!");
                    }else {
                        nTentativas++;
                    }
                }
            } catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Valor inválido");
            }
        } while(userNum != randNum);
    }
}
