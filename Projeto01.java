package projeto;

import java.util.Scanner;

public class Projeto01 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Escolha  a operação:");
	        System.out.println("1. Soma");
	        System.out.println("2. Multiplicação");
	        int opcao = scanner.nextInt();

	        System.out.print("Digite o primeiro número: ");
	        double numero1 = scanner.nextDouble();

	        System.out.print("Digite o segundo  número: ");
	        double numero2 = scanner.nextDouble(); 


	        double resultado;

	        switch (opcao) {
	            case 1:
	                resultado = numero1 + numero2;
	                System.out.println("A soma dos números é: " + resultado);
	                break;
	            case 2:
	                resultado = numero1 * numero2;
	                System.out.println("A multiplicação dos números é: " + resultado);
	                break;
	            default:
	                System.out.println("Opção inválida.");
	        }

	        scanner.close();
	    }
	}