import java.util.Scanner;
public class ExercicioSeis {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o primeiro numero: ");
        int num1 = scan.nextInt();

        System.out.println("Entre com o segundo numero: ");
        int num2 = scan.nextInt();

        System.out.println("Entre com o terceiro numero: ");
        int num3 = scan.nextInt();

        if(num1 > num2 && num1>num3){
            System.out.println("Numero 1 é o maior: "+num1);
        }else if(num2 > num1 && num2>num3){
            System.out.println("Numero 2 é o maior "+num2);
        }else{
            System.out.println("numero 3 é o maior "+num3);
        }


    }
}
