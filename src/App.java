import java.util.Scanner;

public class App {
    public static void main(String[] args) {
 
        Scanner ler = new Scanner(System.in);
    
        double quantHora;
        double valorHora;
    

        System.out.println("Informe a quantidade de horas trabalhadas no mes: ");
        quantHora = ler.nextDouble();
    
        System.out.println("Informe o valor de cada hora: ");
        valorHora = ler.nextDouble();

       System.out.println("O salario é: R$ " + quantHora *valorHora );


    ler.close();

        }
    }
    

