package com.company;

import javax.swing.*;

public class Exe03 {
/*
Usando a classe JOptionPane para entrada de dados,
   elabore uma classe que receba a nota de duas provas e
    de um trabalho. Calcule e mostre a média e o resultado
    final (aprovado ou reprovado). Para calcular a média utilize a fórmula
    seguinte: média = (nota da prova 1 + nota da prova 2 + nota do trabalho) / 3.
        Considere que a média mínima para aprovação é 7.
 */

    public static void main(String[] args) {
        double nota01,nota02,nota03, media;
        /*
        String input =JOptionPane.showInputDialog("Nota de n1");
        n1 =Double.parseDouble(input);
         */
        nota01= Double.parseDouble(JOptionPane.showInputDialog("Nota de n1"));
        nota02= Double.parseDouble(JOptionPane.showInputDialog("Nota de n2"));
        nota03= Double.parseDouble(JOptionPane.showInputDialog("Nota de T1"));
        media = (nota01+nota02+nota03)/3;
        if(media>7){
            System.out.println("Uhuuuuuuu aprovado");
        }else{
            System.out.println("errou");
        }
    }

}
