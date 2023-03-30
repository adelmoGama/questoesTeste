package questao_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Questao2 {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
	    int n1 = 0;
	    int n2 = 1;
	    list.add(n1, n2);
	    System.out.println("Informe o fim da sequência: ");
	    for(int fim = teclado.nextInt(); fim >1; fim--) {
	    	int n3 = n1 + n2;
	    	list.add(n3);
	    	n1 = n2;
	    	n2 = n3;
	    }
	    System.out.println();
	    System.out.println("Informe o número que quer procurar na sequência: ");
	    int numero = teclado.nextInt();
	    int procura = 0;
	    for (Integer n : list) {
	    	System.out.println(n);
			if(n == numero) {
				// CASO QUEIRA CONFIRMAR A SEQUÊNCIA
				System.out.println("Pertence ao intervalo desta sequência");
				procura = n;
				break;
			}
		}
	    if(procura != numero) {
	    	System.out.println("Não pertence ao intervalo desta sequência");
	    }
	    teclado.close();
	}
}
