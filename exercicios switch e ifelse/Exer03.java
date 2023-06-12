import java.util.Scanner;

public class Exer03 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com uma letra: ");
        String letra = scan.nextLine();
        switch(letra){
            case "a":
            case "e":
            case "i":
            case "o":
            case "u": System.out.println("Vogais. "); break;
            default : System.out.println("Consoantes.");
        }

    }
}