package Aula_03;

import javax.swing.*;

/**
 * Created by ramon on 3/20/17.
 * O Imposto sobre a Transmissão de Bens Móveis (ITBI)
 * é aplicado sobre o valor de um imóvel a ser negociado.
 * A base de cálculo do ITBI (o valor a ser considerado no cálculo)
 * será o maior valor entre o valor de transação (o valor negociado)
 * e o valor venal de referência (fornecido pela Prefeitura)
 * . Com base nisso, elabore uma classe que receba o valor da transação,
 * o valor venal e o percentual de imposto. Após isso,
 * encontre o maior valor e aplique o percentual sobre ele. Ao final,
 * apresente o valor do imposto a ser pago. Observação: o valor do imposto a
 * ser pago é calculado por meio da fórmula: valor do imposto = maior valor * percentual / 100.
 * Para entrada e saída de dados utilize a classe JOptionPane.
 */
public class At02 {

    public static void main(String[] args) {

        double valorVenal, valorTrans, imposto,taxa;

        valorVenal = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor Venal"));
        valorTrans = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da transação"));
        taxa = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor percentual"));

        if (valorVenal>valorTrans){
            imposto=valorVenal*taxa/100;
            JOptionPane.showMessageDialog(null,"imposto a ser pago:"+imposto);
        }else{
            imposto=valorTrans*taxa/100;
            JOptionPane.showMessageDialog(null,"imposto a ser pago:"+imposto);

        }

    }
}
