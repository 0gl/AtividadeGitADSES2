import java.util.Scanner;

public class Main {

    public static void main() {

        int opcao = 0;
        Scanner entrada = new Scanner(System.in);

        //apresentar o programa
        System.out.println("Calculo de area/circunferencia ou area/perimetro");

        do {

            //oferecer as opcoes de circulo ou quadrado
            System.out.print("Digite 1 para circulo, 2 para quadrado ou 3 para encerrar o programa: ");
            entrada.nextInt();

            switch(opcao) {

                case 1:
                    //instanciar o objeto para circulo
                    //receber o raio
                    //passar o argumento para a instancia
                    //exibir o resultado
                    break;

                case 2:
                    //instanciar o objeto para quadrado
                    //receber o lado
                    //passar o argumento para a instancia
                    //exibir o resultado
                    break;

                case 3:
                    opcao = 4;
                    break;

                default:
                    break;

            }

        } while ((opcao < 1) || (opcao > 3));

    }

}
