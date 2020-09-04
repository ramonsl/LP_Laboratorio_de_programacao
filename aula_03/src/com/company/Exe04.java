package com.company;

import java.util.Scanner;

public class Exe04 {
    /*
        Considere a seguinte informação a respeito do cálculo da aposentadoria.
         Para se aposentar por idade, as mulheres precisam ter atingido 60 anos de idade
       e os homens, 65. Já na aposentadoria por tempo de contribuição,
      o tempo mínimo exigido é de 30 anos para as mulheres e de 35 anos para os homens.
      Com base nessas informações, elabore uma classe que receba a idade de uma pessoa,
      seu sexo e a quantidade de anos de contribuição.
       A seguir, calcule a quantidade de anos que falta de contribuição para se aposentar,
        ou então emita a mensagem: “você já tem o direito a aposentadoria”.

    */
    public static void main(String[] args) {
        int idade;
        int qtdAnos;
        char sexo;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a idade");
        idade = input.nextInt();
        System.out.println("Digite a quantidade de anos");
        qtdAnos = input.nextInt();
        System.out.println("Digite o sexo");
        //sexo = "masculino".charAt(0); ==m
        sexo = input.next().charAt(0);
        //sexo = input.nextLine().charAt(0); //ramon lummertz
        if (sexo == 'f') {
            if ((idade < 60) ||(qtdAnos>=30)) {
                int anosAposentar =  30 -qtdAnos;
                if (anosAposentar <= 0) {
                    System.out.println("Você ja pode se aposentar pelo tempo de contribuica");
                } else {
                    System.out.println("Falta  " + anosAposentar + " para você se aposentar");
                }
            } else {
                System.out.println("Você ja pode se aposentar pelo fato idade");
            }
        } else {
            if ((idade < 65) || (qtdAnos>=35)) {
                int anosAposentar =   35-qtdAnos;
                if (anosAposentar <= 0) {
                    System.out.println("Você ja pode se aposentar pelo tempo de contribução");
                } else {
                    System.out.println("Falta  " + anosAposentar + " para você se aposentar");
                }
            } else {
                System.out.println("Você ja pode se aposentar pelo fator  de idade");
            }
        }
    }
}
