import java.util.Scanner;

public class ExercicioDez {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Escreva qual é o seu turno: M,N, V");
        String turno = scan.nextLine();

        if(turno.equalsIgnoreCase("m")){
            System.out.println("Bom dia!! ");
        }else if(turno.equalsIgnoreCase("n")){
            System.out.println("Boa noite!! ");
        }else if(turno.equalsIgnoreCase("v")){
            System.out.println("Boa tarde!! ");
        }else{
            System.out.println("Turno invalido!!! ");
        }
    }
}
