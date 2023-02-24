package com.primeiroprojeto.PrimeiroProjeto;

import java.net.InetAddress;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.net.UnknownHostException;

import java.util.Date;
import java.util.Locale;

public class PcInfo {
    public static void main(String[] args) {
        System.out.println("=========================INFORMAÇÕES DO PC==============================");
        System.out.println(namePC());
        System.out.println("------------------------------------------------------------------------");
        System.out.println(resolution());
        System.out.println("------------------------------------------------------------------------");
        System.out.println(dateTime());
        System.out.println("------------------------------------------------------------------------");
        System.out.println(lang());
    }
    
    public static String resolution(){
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        
        int largura = dimension.width;
        int altura = dimension.height;
        
        return "Monitor: " + largura + "x" + altura;
    }
    
    public static String dateTime(){
        Date data = new Date();
        
        return "Hora do sistema: " + data.toString();
    }
    
    public static String lang(){
        Locale lang = Locale.getDefault();
        
        return "Idioma do sistema: " + lang.getDisplayLanguage();  
    }

    public static String namePC(){
        try {
            InetAddress addr = InetAddress.getLocalHost();
            String hostname = addr.getHostName(); 

            return "PC: " + hostname;
        } catch (UnknownHostException ex) {
            return "Vazio";
        }        
    }
}
