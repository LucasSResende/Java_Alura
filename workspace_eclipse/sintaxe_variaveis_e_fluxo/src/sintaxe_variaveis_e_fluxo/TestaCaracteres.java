package sintaxe_variaveis_e_fluxo;

public class TestaCaracteres {
	public static void main(String[] args) {
		char letra = 'a';
		System.out.println(letra);
		
		char valor = 65;
		valor = (char) (valor + 1);	
		System.out.println(valor+1);
		
		String palavra = "Lucas vai bombar!!! ";
		System.out.println(palavra);
		
		palavra += 2023;
		System.out.println(palavra);
		
		String parcela1 = "10";
		String parcela2 = "20";

		System.out.println(parcela1 + parcela2);
	}
}
