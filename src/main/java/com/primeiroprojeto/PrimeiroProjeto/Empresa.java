package com.primeiroprojeto.PrimeiroProjeto;

public class Empresa {
    public static void main(String[] args){
        float janeiro = (float) 15000.00;
        float fevereiro = (float) 23000.00;
        float marco = (float) 17000.00;
        float total = janeiro + fevereiro + marco;
        
        System.out.println("======TABELA DE GASTOS======");
        System.out.printf("Janeiro: R$ %.2f\n", janeiro);
        System.out.printf("Fevereiro: R$ %.2f\n", fevereiro);
        System.out.printf("Março: R$ %.2f\n", marco);
        System.out.println("-------------------------------");
        System.out.printf("Total: R$ %.2f\n", total);
        System.out.println("==============================\n");
        System.out.println(total  > 50000 ? "O valor estourou o orçamento!!": "O valor está dentro do orçamento.");
    }
}
