import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int opcao = 0;
        double saldo = 3000.00;
        double valor = 0;
        Scanner ler = new Scanner(System.in);
        System.out.println("*********************************");
        System.out.println("Dados Cadastrais \n");
        System.out.println("Nome: Diego Daniel");
        System.out.println("Tipo: Conta Corrente");
        System.out.println("Saldo: " + saldo);
        System.out.println("*********************************");
        while(opcao != 4) {
            System.out.println("\n\nOpções\n");
            System.out.println("1 - Verificar saldo.");
            System.out.println("2 - Receber valor.");
            System.out.println("3 - Transferir valor.");
            System.out.println("4 - Sair.\n\n");
            System.out.println("opção desejada: ");
            opcao = ler.nextInt();
            if (opcao == 1){
                System.out.println("Saldo atual: "+saldo);
            }
            if (opcao == 2){
                System.out.println("\n\nInsira o valor: ");
                valor = ler.nextDouble();
                System.out.println("Recebimento concluido!");
                saldo +=valor;
            }
            if (opcao == 3){
                System.out.println("\n\nInsira o valor: ");
                valor = ler.nextDouble();
                if (valor > saldo){
                    System.out.println("Valor superior ao saldo atual. Transferencia cancelada!");
                } else {
                    System.out.println("Transrferencia feita com sucesso!");
                    saldo -= valor;
                }
            }
            if (opcao == 4){
                System.out.println("\n\nSaindo...\n");
                break;
            }
        }
    }
}