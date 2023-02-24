package com.primeiroprojeto.PrimeiroProjeto;

public class SwitchCase {
    public static void main(String[] args){
        int x = 20;

        switch(x){
            case 0:
                System.out.println("X é 0");
                break;
                
            case 1:
                System.out.println("X é 1");
                break;
                
            default:
                System.out.println("X tem um valor diferente de 0 e 1");
                break;
        }
    }
}
