import java.util.Scanner;
public class Exercicios {

    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Escreva o primeiro numero: ");
        int num1 = scan.nextInt();
        System.out.println("Escreva o segundo numero: ");
        int num2 = scan.nextInt();

        if(num1 > num2){
            System.out.println("O maior numero é: "+num1);
        }else{
            System.out.println("O maior numero é: "+num2);
        }
        

    }
    
}

