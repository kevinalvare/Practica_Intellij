import java.util.Scanner;
public class Main {



    public static void main(String[] args) {
     Scanner Scanner = new Scanner(System.in);
     Persona persona = new Persona();

         System.out.println("Escriba su nombre");
         persona.setName(Scanner.nextLine());
         System.out.println("Escriba numero de celular");
         persona.setCell(Scanner.nextLine());
         System.out.println("escriba su edad");
         persona.setAge(Scanner.nextInt());
         persona.getPerson();

    }
}
