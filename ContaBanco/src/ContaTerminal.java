/**
 * <h1>Conta Terminal</h1>
* A classe Conta Terminal recebe inputs de dados de uma conta bancária e as utiliza para retornar uma mensagem com essas informações
* @author  Allan G. Alves
* @version 1.0
* @since   09/19/2024
*/

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    /**
     * Este método recebe os dados da conta bancária pelo Scanner atribuindo eles a variáveis e utiliza eles para a mensagem retornada ao usuário 
     */
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome:");
        String nomeCliente = scanner.next();

        System.out.println("Digite o número da conta:");
        int numero = scanner.nextInt();

        System.out.println("Digite o número da agência:");
        String agencia = scanner.next();

        System.out.println("Digite o saldo:");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + "! " + "obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " , conta " + numero + " e seu saldo " + saldo + " já está disponível para saque!");
        
        scanner.close();
    }
}
