package questao_1;

public class Questao1 {

	public static void main(String[] args) {
		Integer indice = 13;
		Integer soma = 0;
		Integer k = 0;
		
		while(k < indice) {
			k ++;
			soma += k;
		}
		
		System.out.println(soma);
	}
}