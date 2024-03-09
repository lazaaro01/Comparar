import java.util.Scanner; // programa ultiza a  classe Scanner

public class Compara {
public static void main(String[] args) { // Método principal inicia a execução  do app Java
    
    try (Scanner input = new Scanner(System.in)) {
        int number1; // Primeiro número a comparar
        int number2; // Segundo número a comparar

        System.out.print("Digite um valor:");
        number1 = input.nextInt(); // Lê o primeiro número fornecido pelo o usuário

        System.out.print("Digite o segundo valor:");
        number2 = input.nextInt(); // Lê o segundo número forncecido pelo o usuário

        if ( number1 == number2 )  {
            System.out.printf("%d == %d\n", number1, number2);
        }
        if ( number1 != number2 ) {
            System.out.printf("%d != %d\n", number1, number2);
        }
        if ( number1 < number2 ) {
            System.out.printf("%d < %d\n", number1, number2);
        }
        if ( number1 > number2 ) {
            System.out.printf("%d > %d\n", number1, number2);
        }
        if ( number1 <= number2 ) {
            System.out.printf("%d <= %d\n", number1, number2);
        }
        if ( number1 >= number2 ) {
            System.out.printf("%d >= %d\n", number1, number2);
        }
    }
}
    
}