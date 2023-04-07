package sintaxe_variaveis_e_fluxo;

public class TestaConversao {
	public static void main(String[] args) {
		double salario = 1270.50;
		float pontoFlutuante = 5.55f;
		
		System.out.println(pontoFlutuante);
		
		int valor = (int)salario;
		System.out.println(valor);
		
		long numeroGrande = 6456654146l;
		System.out.println(numeroGrande);
		
		short numeroPequeno = 22;
		System.out.println(numeroPequeno);
		
		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1 + valor2;
		
		System.out.println(total);
	}
}
