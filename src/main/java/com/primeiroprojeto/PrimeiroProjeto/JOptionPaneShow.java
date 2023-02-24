package com.primeiroprojeto.PrimeiroProjeto;

import javax.swing.JOptionPane;

public class JOptionPaneShow {
    public static void main(String[] args) {
        JOptionPane GUI = new JOptionPane();
        
        /*String texto = GUI.showInputDialog("Digite um número: ");*/
        int viado = GUI.showConfirmDialog(GUI, "O pedro é viado?");
        GUI.showMessageDialog(GUI, viado == 0 ? "Verdade!" : "Mentira!!!");   
    }
}
