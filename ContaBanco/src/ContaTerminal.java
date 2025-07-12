import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        double saldo = 1500.00;

        System.out.println("Digite o nome cadastrado na conta: ");
             String nomeCliente = teclado.next();

        System.out.println("Por gentileza, insira o número da agência: ");
             int agencia = teclado.nextInt();

        System.out.println("No proximo passo, digite o numero da conta, 4 digitos apenas: ");

        int conta = teclado.nextInt();
             if(conta > 1000 && conta <= 9999){
                      System.out.println("Numero de conta valido");
                      System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %s já está disponível para saque!", nomeCliente,agencia, conta, saldo);

             }else {
                  System.out.println("Numero de conta invalido");
              }
        


    
    }
}
