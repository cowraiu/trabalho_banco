
import java.lang.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     int i, j, aux;
     i = 0;
     Scanner entrada = new Scanner(System.in);
     Scanner entradaN = new Scanner(System.in);

     dados d = new dados();

     System.out.println("Digite seu nome: ");
     d.setNome(entrada.nextLine());
     System.out.println("Digite seu sobrenome: ");
     d.setsobrenome(entrada.nextLine());
     System.out.println("Digite seu cpf: ");
     d.setcpf(entrada.nextInt());

     do{
         System.out.println("Para sacar digite 1, Para depositar digite 2, Para sair digite 0: ");
         i = entradaN.nextInt();
         if(i == 1){
             System.out.println("Quanto quer sacar?: ");
             j = entrada.nextInt();
             aux = d.getSaldo() - j;
             try {
                 d.setsaldo(aux);
                 System.out.println("Voce tem: " + d.getSaldo());
             }catch (RuntimeException e){
                 System.out.println(e.getMessage());
             }
         }
         else if(i == 2){
             System.out.println("Quanto quer depositar?: ");
             j = entrada.nextInt();
             aux = j + d.getSaldo();
             d.setsaldo(aux);
             System.out.println("Voce tem: " + d.getSaldo());

         }

     }while(i != 0);

     System.out.println("Seus dados ->\t" + d.imprimir());



    }
}