import java.util.*;

    // TODOlista abaixo.
    //1 - Conhecer e importar a classe scanner -done
    //2 - Exibir mensagens para o usuario
    //3 - Obter pelo scanner valores digitado no terminal
    //4 - Mensagem final
    
public class ContaTerminal { 
    /**
     * @param args
     * @throws Exception
     * 
     */
    public static void main(String[] args) throws Exception {

    Scanner sc = new Scanner(System.in);
    double saldo = 300, valorSaque=0, valorDeposito=0;

    System.out.println("Favor insera seu NOME!");
    String nomeCliente = sc.nextLine(); 

    System.out.println("Favor inserir o numero da agencia!");
    String agencia = sc.nextLine();     

    System.out.println("Favor inserir o numero da conta!");
    int numeroConta = sc.nextInt();

//Boas Vindas ao cliente
    System.out.printf("%s%s%s%s%s%s%s%s%s%n/n","Olá ", nomeCliente, " obrigado por criar uma conta em nosso banco, sua agência é ", agencia, ", conta ", numeroConta," e seu saldo ", saldo, " já está disponível para saque.");
//Opções Cliente
    System.out.printf("%s%n","Selecione a opção desejada:");
    
    System.out.printf("%s%n","Digite 1 para verificar seu saldo");

    System.out.printf("%s%n","Digite 2 para efetuar um saque");

    System.out.printf("%s%n","Digite 3 para depositar em sua conta");

    System.out.printf("%s%n","Digite 4 para Finalizar a aplicação");

    var operacao = sc.nextInt();

    sc.close();

    switch(operacao){
        case 1: System.out.printf("%s%2f","Saldo atual ", saldo);
        break;
        case 2: saque(saldo,valorSaque);
        break;
        case 3: deposito(saldo,valorDeposito);
        break;
        case 4: System.out.printf("%s/n%f","Saldo atual ", saldo);
        break;
    }

    }

/**
 * @param saldo
 * @param valorSaque
 */
private static void saque(Double saldo,Double valorSaque){
    if (saldo < valorSaque){
        System.out.println("Saldo insificiente para o efetuar o saque");
    }else{
        saldo = saldo - valorSaque;
        System.out.printf("%s%2f","Saldo atual ", saldo);
    }
}

    /**
     * @param saldo
     * @param valorDeposito
     */
    private static void deposito(Double saldo,Double valorDeposito){
    if (saldo < valorDeposito){

        saldo = saldo - valorDeposito;
        System.out.printf("%s%2f","Saldo atual ", saldo);
    }
}

}
