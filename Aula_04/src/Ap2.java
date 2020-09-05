/*Já que todos os strings são objetos de tipo String, mostre como chamar os métodos length( ) e charAt( ) neste literal de string: “I like Java”.*/

// class Main {
// 	public static void main(String [] args) {
//     String string = "I like Java";

//     System.out.println(string.length());

//     System.out.println(string.charAt(0));

//   }
// }

/*Já que todos os strings são objetos de tipo String, mostre como chamar os métodos length( ) e charAt( ) neste literal de string: “I like Java”.*/

class Ap2 {
    public static void main(String [] args) {
        String string = "I like Java";

        System.out.println(string.length());

        for(int i=0;i<string.length(); i++){
            System.out.println(string.charAt(i));
        }


    }
}


















// boa noite, posicione se mouse aqui


// class Main {

//   /*
//   Escreva um programa que crie um array de inteiros data e use um laço for para criar um novo String que exiba o conteúdo do array data entre chaves e separado por vírgulas. Por exemplo, se o array data tiver tamanho 4 e armazenar os valores 3, 4, 1, 5, o String “{3, 4, 1, 5}” deve ser criado e exibido.
//   */
//   public static void main(String[] args) {
//          int[] data = {3,5,5,5,5,5,5, 4, 1, 5};    
//          String exibe = "{"; 

//        for (int i=0; i<data.length; i++){
//          if(i==data.length - 1){
//            exibe+=Integer.toString(data[i]) + "}";
//          }else{
//            exibe+=Integer.toString(data[i]) + ", ";
//          }
//        }
//       System.out.println(" os valores armazenados são: " + exibe);
//   	}
// } 