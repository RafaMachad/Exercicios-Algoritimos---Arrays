import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {

        

        Scanner stalin = new Scanner(System.in);
        int acesso =0;
        String sair = "n";
        Scanner lenin = new Scanner(System.in);
        
        do{
            Principal.limpaTela();
        System.out.println("ESCOLHA O EXERCICIO CORRESPONDENTE:");
        System.out.println("[1] - Receber 8 numeros e calcular media simples.");
        System.out.println("[2] - Receber 10 numeros. Exibir numeros pares.  ");
        System.out.println("[3] - Achar o numero randomico.");
        System.out.println("[4] - Sorteio de 2 arrays.");
        System.out.println("[5] - Escolher menor e maior numero de uma Array.");
        System.out.println("[6] - Organizar Array.");
        System.out.println("[7] - SAIR.");
        acesso = stalin.nextInt();
        switch (acesso) {
            case 1:
                teste1.addNum();
                break;
            case 2:
                teste2.addNum();
                break;
            case 3:
                teste3.numRand();
                break;
            case 4:
                teste4.sortNum();
                break;
            case 5:
                teste5.sortNum();
                break;
            case 6:
                teste6.sortVetor();
                break;
            case 7:
                sair = "s";
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Insira um numero valido por favor!");

                break;
        }//fim switch
    }while(sair != "s");    

   
}
public static void limpaTela() {  
    System.out.print("\033[H\033[2J");  
    System.out.flush();  
}  
}
