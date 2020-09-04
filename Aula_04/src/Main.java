import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        double[][] numerosDouble = new double[3][3];

        int a =10;
        if (a==10){  //int. short boolean char double float long bity
            System.out.println("igual a 10");
        }

        String abc="Ramon";
        if(abc.equals("Ramon")){ /// qualquer outra coisa
            System.out.println("Strings iguais");
        }





        numerosDouble[0][0]=00;
        numerosDouble[1][0]=10;
        numerosDouble[2][1]=21;

        System.out.println(numeros);
        numeros[0]=100;

        Scanner tc= new Scanner(System.in);
        for(int i=0;i< numeros.length;i++){
      //      numeros[i]=tc.nextInt();
        }
        for(int i=0;i< numeros.length-1;i++){
            System.out.println("valor na posição "+i +" "+numeros[i]);
        }

        for (int l=0; l< numerosDouble[l].length-1; l++){
            for (int c=0;c<3;c++){
                System.out.println("valor na posição "+l +" "+ c+" "+numerosDouble[l][c]);

            }
        }

    }
}
