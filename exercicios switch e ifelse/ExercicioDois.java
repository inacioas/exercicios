import java.util.Scanner;
public class ExercicioDois {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Escreva um valor positivo ou negativo: ");
        double valor = scan.nextDouble();
        

        if(valor < 0){
            System.out.println("Negativo!!!");
        }else{
            System.out.println("Positivo!!");
        }

        
    }
    
}
