public class Banco {
    public static String nome = "NoName"; //qualquer um pode acessar o nome
    protected static int numero; //numero da conta é privado
    protected static String agencia; //agencia é privado
    private static double saldo = 00; //saldo é privado, mas acho q devia ser protected 

    public void setNumero(int n) {
        numero = n;
    }
    
    public void setAgencia(String agenciaString) {
        agencia = agenciaString;
    }

    public void setNome(String sNome) {
        nome = sNome;
    }
    

    public double getSaldo() throws Exception {
        return saldo;
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo = saldo - valor;
        } else {
            System.out.println("Você nao tem saldo o suficiente!");
        }
    }

    public void depositar(double valor) {
        saldo = saldo + valor;
    }


    //teste
    protected void checkConta(int n) {
        if (n == 1024) {
            nome = "Pablo";
            agencia = "1234-5";
            saldo = 102.09;
        }

    }
}
