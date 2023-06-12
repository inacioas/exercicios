import java.util.Scanner;

public class ExercicioTres {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Escreva uma letra F ou M: ");
        String input = scan.nextLine();
       
        if(input.equalsIgnoreCase("f")){
            System.out.println("f - feminino");
        }else if(input.equalsIgnoreCase("m")){
            System.out.println("m - masculino ");
        }else{
            System.out.println("Sexo inválido ");
        }

    }
    
}
