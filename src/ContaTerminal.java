import java.util.Scanner;

public class ContaTerminal {
    public static Scanner terminal = new Scanner(System.in); //criando um objeto
    public static Banco banco = new Banco();

    public static void main(String [] args) throws Exception {
        System.out.printf("Digite o numero da sua conta: ");
        int numero_banco = terminal.nextInt();
        banco.setNumero(numero_banco);

        System.out.println("Digite sua agencia: ");
        String banco_agencia = terminal.next();
        banco.setAgencia(banco_agencia);

        System.out.println("Digite seu nome: ");
        String banco_nome = terminal.next();
        banco.setNome(banco_nome);


        // banco.checkConta(numero_banco);
        String nome = banco.nome;
        String agencia = banco.agencia;
        int numero = banco.numero;
        double saldo = banco.getSaldo();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$ %f já está disponível para saque", nome, agencia, numero, saldo);
    
        //
    }

}