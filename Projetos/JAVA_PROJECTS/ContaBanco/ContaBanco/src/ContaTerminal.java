import java.util.*;

    // TODO: 
    //1 - Conhecer e importar a classe scanner -done
    //2 - Exibir mensagens para o usuario
    //3 - Obter pelo scanner valores digitado no terminal
    //4 - Mensagem final
    
public class ContaTerminal { 
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

    Scanner sc = new Scanner(System.in);
    float saldo = 300, valorSaque=0, valorDeposito=0;

    
    System.out.println("Favor insera seu NOME!");
    String nomeCliente = sc.nextLine(); 

    System.out.println("Favor inserir o numero da agencia!");
    String agencia = sc.nextLine();     

    System.out.println("Favor inserir o numero da conta!");
    int numeroConta = sc.nextInt();

    System.out.printf("%s%n%%s%n%%s%n%%s%n%","Digete a opção desejada:","Digite 1 para verificar seu saldo","Digite 2 para efetuar um saque","Digite 3 para depositar em sua conta");
    int operacao = sc.nextInt();

    switch(operacao){
        case 1: System.out.printf("%s%f","Saldo atual ", saldo);
        break;
        case 2: saque(saldo,valorSaque);
        break; 
    }

    }

static void saque(float saldo,float valorSaque){
    if (saldo < valorSaque){
        System.out.println("Saldo insificiente para o efetuar o saque");
    }else{
        saldo = saldo - valorSaque;
        System.out.printf("%s%f","Saldo atual ", saldo);
    };

}

}
