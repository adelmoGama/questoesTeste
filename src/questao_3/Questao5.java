package questao_3;

import java.util.ArrayList;
import java.util.List;

public class Questao5 {
	
	public static void main(String[] args) {
		List<String> letras = new ArrayList<>();
		String palavra = "Teclado";
		
		int tamanho = palavra.length();
		System.out.println(tamanho);
		
		for (int i = 6; i >= 0 ;i--) {
			char a = palavra.charAt(i);
			String b = ""+a;
			letras.add(b);
		}
		
		for (String string : letras) {
			System.out.print(string);
		}
	}
}
