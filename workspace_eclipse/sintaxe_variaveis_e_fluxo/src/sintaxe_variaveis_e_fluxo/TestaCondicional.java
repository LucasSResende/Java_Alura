package sintaxe_variaveis_e_fluxo;

public class TestaCondicional {
	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		int idade = 16;
		int quantidedeDePessoas = 3;
		if (idade >= 18) {
			System.out.println("Você tem mais de 18 anos");
			System.out.println("Seja bem vindo");
		}else {
			if (quantidedeDePessoas >= 2) {
				System.out.println("Você não tem 18 anos, "
						+ "mas pode entrar, já que está acompanhado.");
			}else {
				System.out.println("Infelizmente não pode entrar");
			}
			System.out.println("Infelizmente vc não pode entrar");
		}
		
		
	}
}