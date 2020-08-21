package com.company;

import java.util.Scanner;

public class Exe01 {

    /*Usando a classe Scanner para entrada de
    dados, crie uma classe que receba o valor
    de um produto e a porcentagem de desconto,
    calcule e mostre o valor do desconto e o
    valor do produto com o desconto. Observação:
    o valor do desconto é calculado por meio da fórmula:
    valor do desconto = valor do produto * percentual de desconto / 100.
     */
    public static void main(String[] args) {
        float valor;
        float desconto;
        float valorDesconto;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor do produto:");//escreva
        valor=input.nextFloat();//leiaUmfloat
        System.out.println("Digite o desconto do produto:");//escreva
        desconto=input.nextFloat();//leiaUmfloat
        valorDesconto =valor * (desconto/100);
        System.out.println("O valor do desconto é:"+ valorDesconto);
        System.out.println(String.format("O valor do produto com desconto é: R$ %.2f",(valor - valorDesconto)));
        System.out.printf("Ovalor do produto com desconto é: R$ %.2f", (valor - valorDesconto));
    }
}
