import java.util.Scanner;

public class contaDio {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int numero;
		String agencia;
		String nome_cliente;
		double saldo;
		System.out.println("Nome: ");
		nome_cliente = sc.nextLine();
		System.out.println("Digite a agência: ");
		agencia= sc.nextLine();
		System.out.println("Digite o número da conta: ");
		numero = sc.nextInt();
		System.out.println("Digite o saldo: ");
		saldo= sc.nextDouble();
		String mensagem = "Olá " + nome_cliente + 
                ", obrigado por criar uma conta em nosso banco, sua agência é " + 
                agencia + ", conta " + numero + 
                " e seu saldo " + String.format("%.2f", saldo) + 
                " já está disponível para saque.";

		System.out.println(mensagem);
		sc.close();

	}

}
