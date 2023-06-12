import java.util.Scanner;

public class ExercicioOito {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com o primeiro preço: ");
        double preco1 = scan.nextDouble();

        System.out.println("Entre com o primeiro preço: ");
        double preco2 = scan.nextDouble();

        System.out.println("Entre com o primeiro preço: ");
        double preco3 = scan.nextDouble();
        
        if(preco1<=preco2 && preco1<=preco3){
            System.out.println("Compre o produto 1: "+preco1);
        }else if(preco2<=preco1 && preco2<=preco3){
            System.out.println("Compre o produto 2: "+preco2);
        }else{
            System.out.println("Compre o produto 3: "+preco3);
        }
}
}
