import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        double saldo = 237.48;
        System.out.println("Bem vindo ao programa! Por gentileza, siga as intruções abaixo");

        System.out.println("Qual eu nome: ");
        String nameClient = scan.nextLine();
    

        System.out.println("Digite o número da sua conta: ");
        int conta = scan.nextInt();

        scan.nextLine();

        System.out.println("Digite o número da sua agência: ");
        String agencia = scan.nextLine();

        System.out.printf("Olá, %s! Obrigado por criar uma conta em nosso banco.\nSua agência é %s, conta %d e seu saldo é R$ %.2f.\n", nameClient, agencia, conta, saldo);


        scan.close();
    }
}
