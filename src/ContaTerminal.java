import entities.ContaBancaria;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numeroConta;
        String agencia, nomeCliente;
        double saldo;

        List<ContaBancaria> contaBancarias = new ArrayList<>();

        System.out.println("Seja bem vindo ao nosso banco!");

        System.out.println("Vamos lá criar a sua conta!");

        System.out.print("\nPor favor, digite o número da conta: ");
        numeroConta = sc.nextInt();

        sc.nextLine();
        System.out.print("\nPor favor, digite o número da Agência: ");
        agencia = sc.nextLine();

        System.out.print("\nPor favor, digite seu nome: ");
        nomeCliente = sc.nextLine();

        System.out.print("\nPor favor, digite o valor que deseja depositar na abertura da conta: ");
        saldo = sc.nextDouble();

        ContaBancaria cliente = new ContaBancaria(numeroConta, agencia, nomeCliente, saldo);

        System.out.printf("\nOlá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque." ,
                cliente.getNomeCliente(), cliente.getAgencia(), cliente.getNumeroConta(), cliente.getSaldo());

        sc.close();
    }
}