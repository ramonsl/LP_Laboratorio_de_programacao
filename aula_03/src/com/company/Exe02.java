package com.company;

import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;

public class Exe02 {
    /*
    O Imposto sobre a Transmissão de Bens Móveis (ITBI)
     é aplicado sobre o valor de um imóvel a ser negociado
     . A base de cálculo do ITBI (o valor a ser considerado no cálculo)
     será o maior valor entre o valor de transação (o valor negociado)
      e o valor venal de referência (fornecido pela Prefeitura).
       Com base nisso, elabore uma classe que receba o valor da transação,
       o valor venal e o percentual de imposto. Após isso, encontre o maior
       valor e aplique o percentual sobre ele. Ao final, apresente o
        valor do imposto a ser pago.
        Observação: o valor do imposto a ser pago é calculado
        por meio da fórmula: valor do imposto = maior valor * percentual / 100.
        Para entrada e saída de dados utilize a classe JOptionPane.
     */
    public static void main(String[] args) {

        float valorN;
        float valorV;
        float percetual;
        float valorImposto;
        String input;
        input=JOptionPane.showInputDialog("Digite o valor da venal");
        valorV=Float.parseFloat(input);
        valorN= Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da transação"));
        percetual= Float.parseFloat(JOptionPane.showInputDialog("Digite o valor percentual"));
        if(valorV>=valorN){
            //valor do imposto = maior valor * percentual / 100.
            valorImposto= valorV*percetual/100;
        }else{
            valorImposto= valorN*percetual/100;
        }
        JOptionPane.showMessageDialog(null, "O VALOR A SER PAGO É "+valorImposto);

        
    }

}
