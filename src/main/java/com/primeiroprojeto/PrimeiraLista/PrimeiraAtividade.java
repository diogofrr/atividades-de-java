package com.primeiroprojeto.PrimeiraLista;

import javax.swing.JOptionPane;

public class PrimeiraAtividade {
    public static void main(String[] args) {
        String valorPeso;
        
        String[] opcoes = new String[] {"M", "F"};
        String[] nome = new String[10];
        
        float maiorAltura = 0;
        int qtdMulheres = 0;
        int[] sexo = new int[10];
        
        float[] altura = new float[10];
        
        for (int i = 0; i < 10; i++){
            nome[i] = JOptionPane.showInputDialog(null, "Digite o nome da " + (i + 1) + "ª pessoa: ", "Cadastro", JOptionPane.QUESTION_MESSAGE);
            
            do{
                valorPeso = JOptionPane.showInputDialog(null, "Insira a altura da " + (i + 1) + "ª pessoa: ", "Cadastro", JOptionPane.QUESTION_MESSAGE);
            
                try{
                    altura[i] = Float.parseFloat(valorPeso);
                    break;
                } catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(null, "Valor inválido.");
                }
                if(altura[i] > maiorAltura) maiorAltura = altura[i];
            } while(true);
            
            sexo[i] = JOptionPane.showOptionDialog(
                null,
                "Insira o sexo: ",
                "Cadastro",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                null, opcoes, opcoes[0]
            );
            if(sexo[i] == 1) qtdMulheres++;
        }
        
        JOptionPane.showMessageDialog(null, "Maior altura do grupo: " + maiorAltura, "Resultado", JOptionPane.QUESTION_MESSAGE);
    }
}
